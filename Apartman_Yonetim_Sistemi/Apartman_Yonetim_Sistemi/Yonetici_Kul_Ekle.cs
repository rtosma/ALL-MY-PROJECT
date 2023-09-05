using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Security.Cryptography;
using System.IO;

namespace Apartman_Yonetim_Sistemi
{
    public partial class Yonetici_Kul_Ekle : Form
    {
        public Yonetici_Kul_Ekle()
        {
            InitializeComponent();
        }
        sqlbaglantisi bag = new sqlbaglantisi();
        SqlCommand komut;
        string secili_apartman_id = "0";
        private string password = "1";
        private byte[] Sifrele(byte[] SifresizVeri, byte[] Key, byte[] IV)

        {

            MemoryStream ms = new MemoryStream();

            Rijndael alg = Rijndael.Create();



            alg.Key = Key;

            alg.IV = IV;



            CryptoStream cs = new CryptoStream(ms,



            alg.CreateEncryptor(), CryptoStreamMode.Write);

            cs.Write(SifresizVeri, 0, SifresizVeri.Length);

            cs.Close();



            byte[] sifrelenmisVeri = ms.ToArray();

            return sifrelenmisVeri;

        }

        public string TextSifrele(string sifrelenecekMetin)

        {

            byte[] sifrelenecekByteDizisi = System.Text.Encoding.Unicode.GetBytes(sifrelenecekMetin);



            PasswordDeriveBytes pdb = new PasswordDeriveBytes(password, new byte[] {0x49, 0x76, 0x61, 0x6e, 0x20, 0x4d,



            0x65, 0x64, 0x76, 0x65, 0x64, 0x65, 0x76});



            byte[] SifrelenmisVeri = Sifrele(sifrelenecekByteDizisi,



                 pdb.GetBytes(32), pdb.GetBytes(16));



            return Convert.ToBase64String(SifrelenmisVeri);

        }
        public void doldurDaire()
        {
            try
            {
                combo_daire_no.Items.Clear();
                SqlCommand com = new SqlCommand("Select id from apartman_islemleri where apartman_adi='" + combo_apartman_adi.Text + "'", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    secili_apartman_id = oku["id"].ToString();


                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }


            ////////

            try
            {
                combo_daire_no.Items.Clear();
                SqlCommand com = new SqlCommand("Select daire_no from daire where apartman_id='" + secili_apartman_id + "'", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                while (oku.Read())
                {
                    combo_daire_no.Items.Add(oku["daire_no"].ToString());


                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }



        }

        private void button15_Click(object sender, EventArgs e)
        {
            if (textBox29.Text==textBox30.Text)
            {
                string sifrelisifre = TextSifrele(textBox30.Text);
                komut = new SqlCommand("insert into kullanici(tc_no,ad,soyisim,email,telefon,daire_no,ev_durumu,rol,sifre,apartman_id) values('" + maskedTextBox2.Text + "','" + textBox25.Text + "','" + textBox26.Text + "','" + textBox27.Text + "','" + maskedTextBox3.Text + "','" + combo_daire_no.Text + "','" + comboBox6.Text + "','" + comboBox7.Text + "','" + sifrelisifre + "','" + secili_apartman_id + "')", bag.baglan());
                komut.ExecuteNonQuery();
                MessageBox.Show("Kayıt Ekleme Başarılı");
            }
            else
            {
                MessageBox.Show("Şifreler Eşleşmiyor !");
            }
        }

        private void combo_daire_no_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void combo_apartman_adi_SelectedIndexChanged(object sender, EventArgs e)
        {
            doldurDaire();
        }
        public void doldurApartman()
        {

            try
            {





                SqlCommand com = new SqlCommand("Select apartman_adi from apartman_islemleri where id='"+Form1.apartman_id+"' ", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    combo_apartman_adi.Items.Add(oku["apartman_adi"].ToString());
                    
                  
                }



                

            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }



        }

        private void Yonetici_Kul_Ekle_Load(object sender, EventArgs e)
        {
            doldurApartman();

        }
    }
}
