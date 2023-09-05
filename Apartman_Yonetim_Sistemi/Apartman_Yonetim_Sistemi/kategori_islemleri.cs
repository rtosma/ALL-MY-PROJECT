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

namespace Apartman_Yonetim_Sistemi
{
    public partial class kategori_islemleri : Form
    {
        sqlbaglantisi baglan = new sqlbaglantisi();
        SqlCommand komut;
        string yetki_kullanici = "0";
        string bilgisayarAdi = System.Net.Dns.GetHostName();
        public kategori_islemleri()
        {
            InitializeComponent();
        }
        void temizle() {


            textBox44.Text = "";
            textBox45.Text = "";

        }
        void borc_tipi()
        {
            try
            {
           
                SqlDataAdapter ad = new SqlDataAdapter("SELECT * FROM borc_tipi", baglan.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView12.DataSource = dt;
                dataGridView12.Columns[0].Visible = false;
      
                dataGridView12.Columns[1].HeaderText = "Borç Tipi";
                dataGridView12.Columns[2].HeaderText = "Borç Açıklaması";
                dataGridView12.Columns[1].Width = 133;
                dataGridView12.Columns[2].Width = 145;
            }
            catch
            {
                ;
            }
        }
        private void button26_Click(object sender, EventArgs e)
        {
            try
            {
             
                komut = new SqlCommand("insert into borc_tipi(borc_tipi,aciklama)values('" + textBox44.Text + "','" + textBox45.Text + "')", baglan.baglan());
                komut.ExecuteNonQuery();
                MessageBox.Show("Ekleme İşlemi Başarılı");

                SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Borç Tipi Ekleme" + "','" + System.Net.Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + "Borç Tipi Ekleme İşlemi Başarıyla Gerçekleşti." + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
                log.ExecuteNonQuery();
            }
            catch
            {
               

                ;
            }
            //sira loga eklemede
      
      

            borc_tipi();
            temizle();
        }

        private void kategori_islemleri_Load(object sender, EventArgs e)
        {
            borc_tipi();
        }

        private void button28_Click(object sender, EventArgs e)
        {
     
            SqlCommand komutt = new SqlCommand("delete from borc_tipi where id='" + dataGridView12.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
            komutt.ExecuteNonQuery();
            MessageBox.Show("Silme İşlemi Başarılı");
        
            //sira loga eklemede
     
            SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Borç Tipi Silme" + "','" + System.Net.Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + "Borç Tipi Silme İşlemi Başarıyla Gerçekleşti." + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
            log.ExecuteNonQuery();
          
            borc_tipi();
            temizle();
        }

        private void textBox46_TextChanged(object sender, EventArgs e)
        {
      
            DataTable dt = new DataTable();
            SqlDataAdapter ad = new SqlDataAdapter("SELECT * FROM borc_tipi WHERE borc_tipi LIKE'%" + textBox46.Text + "%' or aciklama LIKE '%" + textBox46.Text + "%'", baglan.baglan());
            ad.Fill(dt);
            dataGridView12.DataSource = dt;

        }
    }
}
