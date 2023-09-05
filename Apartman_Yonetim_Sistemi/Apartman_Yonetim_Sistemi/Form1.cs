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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        public static string giris = "";
        public static string sifre = "";
        public static string yetki = "";
        public static string apartman_id = "0";
        public static string yetki_kullanici = "0";
        public static string yetki_gider = "0";
        public static string yetki_gelir = "0";
        public static string yetki_kasa = "0";
        public static string yetki_borc = "0";
        public static string yetki_daire = "0";
        private string password = "1";
  
        sqlbaglantisi baglan = new sqlbaglantisi();
        void temizle() {


            textBox1.Text ="";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox4.Text = "";
            textBox5.Text = "";
            textBox6.Text = "";

        }
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



        private byte[] SifreCoz(byte[] SifreliVeri, byte[] Key, byte[] IV)

        {

            MemoryStream ms = new MemoryStream();

            Rijndael alg = Rijndael.Create();



            alg.Key = Key;

            alg.IV = IV;



            CryptoStream cs = new CryptoStream(ms, alg.CreateDecryptor(), CryptoStreamMode.Write);



            cs.Write(SifreliVeri, 0, SifreliVeri.Length);

            cs.Close();



            byte[] SifresiCozulmusVeri = ms.ToArray();

            return SifresiCozulmusVeri;

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



        public string TextSifreCoz(string text)

        {

            byte[] SifrelenmisByteDizisi = Convert.FromBase64String(text);



            PasswordDeriveBytes pdb = new PasswordDeriveBytes(password,



                new byte[] {0x49, 0x76, 0x61, 0x6e, 0x20, 0x4d, 0x65,



            0x64, 0x76, 0x65, 0x64, 0x65, 0x76});



            byte[] SifresiCozulmusVeri = SifreCoz(SifrelenmisByteDizisi,



                pdb.GetBytes(32), pdb.GetBytes(16));



            return System.Text.Encoding.Unicode.GetString(SifresiCozulmusVeri);

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            panel1.Visible = false;
            panel2.Visible = false;
            panel3.Visible = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            panel1.Visible = true;
            panel2.Visible = false;
            panel3.Visible = false;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            panel1.Visible = false;
            panel2.Visible = true;
            panel3.Visible = false;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            panel1.Visible = false;
            panel2.Visible = false;
            panel3.Visible = true;
        }

        private void button4_Click(object sender, EventArgs e)
        {

            try
            {


          

                SqlCommand com = new SqlCommand("Select * from kullanici where tc_no='" + textBox1.Text.ToString() +
                    "'and sifre='" + TextSifrele(textBox2.Text.ToString()) + "'", baglan.baglan());
                //burada veritabanina kodlayarak yazdımız şifrelerin kodlarını karşılaştırdık
                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    //
                    giris = textBox1.Text;
                    sifre = textBox2.Text;
                    yetki = oku["rol"].ToString();
                    apartman_id = oku["apartman_id"].ToString();
                    //kullanıcının yetkisi admin ise onu admin paneline yönlendiriyoruz
                    //formlar arası kullanmak amaçlı public değişkenlere girilen değerleri aldık

                    if (yetki == "Admin")
                    {

                        SqlCommand comt = new SqlCommand("Select * from yetki where tc='" + textBox1.Text.ToString() + "'", baglan.baglan());
                        oku = comt.ExecuteReader();
                        if (oku.Read())
                        {
                            yetki_kullanici = oku["kullanici_isleri"].ToString(); ;
                            yetki_gider = oku["gider_isleri"].ToString();
                            yetki_gelir = oku["gelir_isleri"].ToString();
                            yetki_kasa = oku["kasa_isleri"].ToString();
                            yetki_borc = oku["borc_isleri"].ToString();
                            yetki_daire = oku["daire_isleri"].ToString();
                        }//yetkileri program içi değişkenlere aldık
                        menu menu = new menu();
                        menu.Show();
                        this.Hide();//admin paneline geçiş yapdık 

                    }
                    else if (yetki == "Sakin")//eğer kullanıcı rolü müşteri ise o zaman müşteri paneline yönlendiriyoruz
                    {
                        MessageBox.Show("Admin Değilsiniz ! Sakin Girişi Yapınız");
                    }
                    else if (yetki == "Apartman Yöneticisi")//eğer kullanıcı rolü müşteri ise o zaman müşteri paneline yönlendiriyoruz
                    {
                        MessageBox.Show("Admin Değilsiniz ! Apartman Yöneticisi Girişi Yapınız");
                    }
                    else
                    {
                        MessageBox.Show("Bu Tür yetkili Kullanıcı Yok");
                    }





                }
                else
                {
                    MessageBox.Show(" Kullanıcı Bulunamadı ");
                }
                

            }
            catch (Exception hata)
            {
                MessageBox.Show(hata.Message);//hata mesajı

            }
        }

        private void button5_Click(object sender, EventArgs e)
        {

            try
            {




                SqlCommand com = new SqlCommand("Select * from kullanici where tc_no='" + textBox4.Text.ToString() +
                    "'and sifre='" + TextSifrele(textBox3.Text.ToString()) + "'", baglan.baglan());
                //burada veritabanina kodlayarak yazdımız şifrelerin kodlarını karşılaştırdık
                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    //
                    giris = textBox4.Text;
                    sifre = textBox3.Text;
                    yetki = oku["rol"].ToString();
                    apartman_id = oku["apartman_id"].ToString();
                    //kullanıcının yetkisi admin ise onu admin paneline yönlendiriyoruz
                    //formlar arası kullanmak amaçlı public değişkenlere girilen değerleri aldık

                    if (yetki == "Apartman Yöneticisi")
                    {

                        SqlCommand comt = new SqlCommand("Select * from yetki where tc='" + textBox4.Text.ToString() + "'", baglan.baglan());
                        oku = comt.ExecuteReader();
                        if (oku.Read())
                        {
                            yetki_kullanici = oku["kullanici_isleri"].ToString(); ;
                            yetki_gider = oku["gider_isleri"].ToString();
                            yetki_gelir = oku["gelir_isleri"].ToString();
                            yetki_kasa = oku["kasa_isleri"].ToString();
                            yetki_borc = oku["borc_isleri"].ToString();
                            yetki_daire = oku["daire_isleri"].ToString();
                        }//yetkileri program içi değişkenlere aldık
                        Yonetici menu = new Yonetici();
                        menu.Show();
                        this.Hide();//admin paneline geçiş yapdık 

                    }
                    else if (yetki == "Sakin")//eğer kullanıcı rolü müşteri ise o zaman müşteri paneline yönlendiriyoruz
                    {
                        MessageBox.Show("Apartman Yöneticisi Değilsiniz ! Sakin Girişi Yapınız");
                    }
                    else if (yetki == "Admin")//eğer kullanıcı rolü müşteri ise o zaman müşteri paneline yönlendiriyoruz
                    {
                        MessageBox.Show("Apartman Yöneticisi Değilsiniz ! Admin Girişi Yapınız");
                    }
                    else
                    {
                        MessageBox.Show("Bu Tür yetkili Kullanıcı Yok");
                    }





                }
                else
                {
                    MessageBox.Show(" Kullanıcı Bulunamadı ");
                }


            }
            catch (Exception hata)
            {
                MessageBox.Show(hata.Message);//hata mesajı

            }
        }

        private void button6_Click(object sender, EventArgs e)
        {

            try
            {

                SqlCommand com = new SqlCommand("Select * from kullanici where tc_no='" + textBox6.Text.ToString() +
                    "'and sifre='" + TextSifrele(textBox5.Text.ToString()) + "'", baglan.baglan());
                //burada veritabanina kodlayarak yazdımız şifrelerin kodlarını karşılaştırdık
                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    //
                    giris = textBox6.Text;
                    sifre = textBox5.Text;
                    yetki = oku["rol"].ToString();
                    apartman_id = oku["apartman_id"].ToString();
                    //kullanıcının yetkisi admin ise onu admin paneline yönlendiriyoruz
                    //formlar arası kullanmak amaçlı public değişkenlere girilen değerleri aldık

                    if (yetki == "Sakin")
                    {

                        SqlCommand comt = new SqlCommand("Select * from yetki where tc='" + textBox6.Text.ToString() + "'", baglan.baglan());
                        oku = comt.ExecuteReader();
                        if (oku.Read())
                        {
                            yetki_kullanici = oku["kullanici_isleri"].ToString(); ;
                            yetki_gider = oku["gider_isleri"].ToString();
                            yetki_gelir = oku["gelir_isleri"].ToString();
                            yetki_kasa = oku["kasa_isleri"].ToString();
                            yetki_borc = oku["borc_isleri"].ToString();
                            yetki_daire = oku["daire_isleri"].ToString();
                        }//yetkileri program içi değişkenlere aldık
                        Sakin menu = new Sakin();
                        menu.Show();
                        this.Hide();//admin paneline geçiş yapdık 

                    }
                    else if (yetki == "Apartman Yöneticisi")//eğer kullanıcı rolü müşteri ise o zaman müşteri paneline yönlendiriyoruz
                    {
                        MessageBox.Show("Apartman Yöneticisi Girişi Yapınız");
                    }
                    else if (yetki == "Admin")//eğer kullanıcı rolü müşteri ise o zaman müşteri paneline yönlendiriyoruz
                    {
                        MessageBox.Show("Apartman Sakini Değilsiniz ! Admin Girişi Yapınız");
                    }
                    else
                    {
                        MessageBox.Show("Bu Tür yetkili Kullanıcı Yok");
                    }





                }
                else
                {
                    MessageBox.Show(" Kullanıcı Bulunamadı ");
                }


            }
            catch (Exception hata)
            {
                MessageBox.Show(hata.Message);//hata mesajı

            }
        }
    }
}
