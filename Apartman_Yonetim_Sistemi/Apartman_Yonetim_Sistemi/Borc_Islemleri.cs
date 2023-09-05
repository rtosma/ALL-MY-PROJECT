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
    public partial class Borc_Islemleri : Form
    {
        public Borc_Islemleri()
        {
            InitializeComponent();
        }
        sqlbaglantisi baglan = new sqlbaglantisi();
        SqlCommand komut;
        string bilgisayarAdi = Dns.GetHostName();
        public void temizle() {


            comboBox10.Text = "";

            comboBox13.Text = "";

            comboBox11.Text = "";

            comboBox12.Text = "";

            textBox41.Text = "";

            textBox39.Text = "";

            textBox40.Text = "";

            textBox43.Text = "";

            textBox42.Text = "";


        }
        public void combodoldur() {


            
            komut = new SqlCommand("select * from borc_tipi", baglan.baglan());
            komut.ExecuteNonQuery();
            SqlDataReader dr = komut.ExecuteReader();
            while (dr.Read())
            {
               
      

                comboBox10.Items.Add(dr["borc_tipi"].ToString());

                comboBox13.Items.Add(dr["borc_tipi"].ToString());

            }


            SqlCommand komutt = new SqlCommand("select * from kullanici", baglan.baglan());
            komutt.ExecuteNonQuery();
            SqlDataReader drr = komutt.ExecuteReader();
            while (drr.Read())
            {
                comboBox11.Items.Add(drr["tc_no"].ToString());
                comboBox12.Items.Add(drr["tc_no"].ToString());

            }




        }
        void Borclar()
        {
            try
            {
           
                SqlDataAdapter ad = new SqlDataAdapter("Select * From borclar ORDER BY id DESC", baglan.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView11.DataSource = dt;
                dataGridView11.Columns[0].Visible = false;
      
                dataGridView11.Columns[1].HeaderText = "Borç Kategorisi";
                dataGridView11.Columns[2].HeaderText = "TC Numarası";
                dataGridView11.Columns[3].HeaderText = "Borç Tutarı";
                dataGridView11.Columns[4].HeaderText = "Borç Açıklaması";
                dataGridView11.Columns[5].HeaderText = "Borç Tarihi";
                dataGridView11.Columns[1].Width = 97;
                dataGridView11.Columns[2].Width = 97;
                dataGridView11.Columns[3].Width = 90;
                dataGridView11.Columns[4].Width = 105;
                dataGridView11.Columns[5].Width = 103;
            }
            catch
            {
                ;
            }
        }

        private void Borc_Islemleri_Load(object sender, EventArgs e)
        {
            combodoldur();
            Borclar();
        }

        private void textBox41_TextChanged(object sender, EventArgs e)
        {
      
            DataTable dt = new DataTable();
            SqlDataAdapter ad = new SqlDataAdapter("SELECT * FROM borclar WHERE kategori LIKE'%" + textBox41.Text + "%' or kullanici LIKE '%" + textBox41.Text + "%'or aciklama LIKE '%" + textBox41.Text + "%'OR tutar LIKE '%" + textBox41.Text + "%' ", baglan.baglan());
            ad.Fill(dt);
            dataGridView11.DataSource = dt;

        }

        private void button22_Click(object sender, EventArgs e)
        {

            try
            {
                
                komut = new SqlCommand("insert into borclar(kategori,kullanici,tutar,aciklama,tarih) values('" + comboBox10.Text + "','" + comboBox11.Text + "','" + textBox39.Text + "','" + textBox40.Text + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
                komut.ExecuteNonQuery();
                Borclar();
                temizle();
                MessageBox.Show("Borçlandırma İşlemi Başarılı");
       
            }
            catch
            {

                ;
            }
            //sira loga eklemede burdan başliyor
 
            SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Borçlandırma İşlemi" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + textBox40.Text + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
            log.ExecuteNonQuery();



        }

        private void button24_Click(object sender, EventArgs e)
        {

         
            SqlCommand komutt = new SqlCommand("delete from borclar where id='" + dataGridView11.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
            komutt.ExecuteNonQuery();
            MessageBox.Show("Silme İşlemi Başarılı");
        

            //sira loga eklemede
           
            SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Borç Silme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + "Borç Silme İşlemi Başarıyla Gerçekleşti." + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
            log.ExecuteNonQuery();
     
            Borclar();
            temizle();
        }

        private void button23_Click(object sender, EventArgs e)
        {
            string _borc;
            comboBox13.Text = dataGridView11.CurrentRow.Cells[1].Value.ToString();
            comboBox12.Text = dataGridView11.CurrentRow.Cells[2].Value.ToString();

            textBox42.Text = dataGridView11.CurrentRow.Cells[4].Value.ToString();
            _borc = dataGridView11.CurrentRow.Cells[3].Value.ToString();
            textBox43.Text = String.Format("{0:0}", Math.Round(double.Parse(_borc), 0));


            tabControl1.SelectedTab = tabPage3;
        }

        private void button25_Click(object sender, EventArgs e)
        {
           
            komut = new SqlCommand("update borclar set kategori ='" + comboBox13.Text + "',kullanici='" + comboBox12.Text + "',tutar='" + textBox43.Text + "',aciklama='" + textBox42.Text + "'where id = '" + dataGridView11.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
            komut.ExecuteNonQuery();
            MessageBox.Show("Güncelleme İşlemi Başarılı");
         
            //sira loga eklemede hepsi
          
            SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Borç Güncelleme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + "Borç Güncelleme İşlemi Başarıyla Gerçekleşti." + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
            log.ExecuteNonQuery();
       
            Borclar();
          
            temizle();
        }
    }
}
