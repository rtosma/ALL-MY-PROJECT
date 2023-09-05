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
using System.Net;

namespace Apartman_Yonetim_Sistemi
{
    public partial class daire_islemleri : Form
    {
        public daire_islemleri()
        {
            InitializeComponent();
        }

        sqlbaglantisi baglan = new sqlbaglantisi();
        SqlCommand komut;
        string bilgisayarAdi = System.Net.Dns.GetHostName();
        string apartman_id;



        void daire()
        {
            try
            {
               
                SqlDataAdapter add = new SqlDataAdapter("SELECT * FROM daire", baglan.baglan());
                DataTable dtt = new DataTable();
                add.Fill(dtt);
                dataGridView9.DataSource = dtt;
                dataGridView9.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
                dataGridView9.RowHeadersVisible = false; //Gizlenmesini sağlar 
                dataGridView9.Columns[0].Visible = false;
                dataGridView9.Columns[4].Visible = false;

                dataGridView9.Columns[1].HeaderText = "Daire Tipi";
                dataGridView9.Columns[2].HeaderText = "Kira Tutarı";
                dataGridView9.Columns[3].HeaderText = "Aidat Tutarı";
                dataGridView9.Columns[5].HeaderText = "Daire No";

                dataGridView9.Columns[1].Width = 85;
                dataGridView9.Columns[2].Width = 90;
                dataGridView9.Columns[3].Width = 85;

            }
            catch
            {
                ;
            }
        }
        void temizle() {


            textBox1.Text = "";
            textBox19.Text = "";
            textBox20.Text = "";
            textBox21.Text = "";
           

        }
        public void buAPartmanID()
        {
            try
            {
          
                SqlCommand com = new SqlCommand("Select id from apartman_islemleri where apartman_adi='" + combo_apartman_adi.Text + "'", baglan.baglan());

                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    apartman_id = oku["id"].ToString();


                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }

        }

        public void doldurApartman() //apartmanları doldurma fonksiyonumuz
        {

            try//hata denetlemek için yazdık
            {

                SqlCommand com = new SqlCommand("Select apartman_adi from apartman_islemleri", baglan.baglan()); //tüm apartman isimlerini listeleme sql ifadesi

                SqlDataReader oku = com.ExecuteReader(); // bu sql kodunu çalıştırıp okuyoruz.
                while (oku.Read())// while döngüsü ile tüm kayıtları dolaşıyoruz.
                {
                    combo_apartman_adi.Items.Add(oku["apartman_adi"].ToString()); //gerekli combobaxlara  dolaştığımız kayıtlardaki apartman adlarını ekliyoruz.
                    
                    comboBox1.Items.Add(oku["apartman_adi"].ToString());

                }

            }
            catch (Exception hata) //herhangi bir hata durumunda hata mesajını veriyoruz.
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }



        }
        private void button11_Click(object sender, EventArgs e)
        {
            try
            {
             
                komut = new SqlCommand("insert into daire(tipi,kira,aidat,apartman_id,daire_no)values('" + textBox21.Text + "','" + textBox20.Text + "','" + textBox19.Text + "','"+apartman_id+"','"+textBox1.Text+"') ", baglan.baglan());
                komut.ExecuteNonQuery();
                daire();
                temizle();
                MessageBox.Show("Daire Tipi Ekleme İşlemi Başarılı");
         



                //sira loga eklemede
        
                SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Daire Tipi Ekleme" + "','" + System.Net.Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + "Yeni Bir Daire Tipi Eklenmiştir." + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
                log.ExecuteNonQuery();
             
        


            }
            catch
            {

                ;
            }
        }

        private void combo_apartman_adi_SelectedIndexChanged(object sender, EventArgs e)
        {
            buAPartmanID();
        }

        private void daire_islemleri_Load(object sender, EventArgs e)
        {
            doldurApartman();
            daire();
        }

        private void button13_Click(object sender, EventArgs e)
        {

     
  
            SqlCommand komutt = new SqlCommand("delete from daire where id='" + dataGridView9.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
            komutt.ExecuteNonQuery();
            MessageBox.Show("Silme İşlemi Başarılı");
  

            //sira loga eklemede
          
            SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Daire Tipi Silme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + "Daire Tipi Silme İşlemi Başarıyla Gerçekleşti." + "','" + DateTime.Now+ "')", baglan.baglan());
            log.ExecuteNonQuery();
      
            daire();
            temizle();
        }

        private void button12_Click(object sender, EventArgs e)
        {

            try
            {
            
                komut = new SqlCommand("update daire set tipi = '" + textBox24.Text + "', kira = '" + textBox23.Text.Replace(',','.') + "', aidat = '" + textBox22.Text.Replace(',', '.') + "',daire_no='"+textBox2.Text+"',apartman_id='"+apartman_id+"'  where id='" + dataGridView9.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
                komut.ExecuteNonQuery();
                MessageBox.Show("Daire Tipi Güncelleme İşlemi Başarılı");
              



                //sira loga eklemede
            
                SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Daire Tip Güncelleme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + textBox22.Text + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
                log.ExecuteNonQuery();
             

                temizle();
                daire();



            }
            catch(Exception hata)
            {

                MessageBox.Show("Hata Aldınız ! "+hata.Message);
            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            try
            {

                SqlCommand com = new SqlCommand("Select id from apartman_islemleri where apartman_adi='" + comboBox1.Text + "'", baglan.baglan());

                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    apartman_id = oku["id"].ToString();


                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }
        }

        private void button14_Click(object sender, EventArgs e)
        { string apartadi = "";
         
                
                SqlCommand com = new SqlCommand("Select apartman_adi from apartman_islemleri where id='" + dataGridView9.CurrentRow.Cells[4].Value.ToString() + "'", baglan.baglan());

                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    apartadi = oku["apartman_adi"].ToString();


                }






                
            textBox24.Text = dataGridView9.CurrentRow.Cells[1].Value.ToString();   //tipi
   
            textBox23.Text = dataGridView9.CurrentRow.Cells[2].Value.ToString(); //kira
            textBox22.Text = dataGridView9.CurrentRow.Cells[3].Value.ToString(); //aidat
            textBox2.Text = dataGridView9.CurrentRow.Cells[5].Value.ToString(); //daire_no
                                                                               
            comboBox1.Text = apartadi; //apartman adi
           

            tabControl1.SelectedTab = tabPage2;

        
        }
    }
}
