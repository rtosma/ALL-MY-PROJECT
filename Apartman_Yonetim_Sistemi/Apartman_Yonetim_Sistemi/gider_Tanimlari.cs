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
    public partial class gider_Tanimlari : Form
    {
        sqlbaglantisi baglan = new sqlbaglantisi();
        SqlCommand komut;
        string bilgisayarAdi = System.Net.Dns.GetHostName();
        public gider_Tanimlari()
        {
            InitializeComponent();
        }

        void temizle() {

            textBox6.Text = "";
            textBox7.Text = "";
            textBox8.Text = "";
            textBox9.Text = "";
            comboBox3.Text = "";
            comboBox4.Text = "";


        }
        void gider()
        {
            try
            {
             
                SqlDataAdapter ad = new SqlDataAdapter("SELECT * FROM giderler", baglan.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView6.DataSource = dt;
                dataGridView6.Columns[0].Visible = false;
          
                dataGridView6.Columns[1].HeaderText = "Gider Kategorisi";
                dataGridView6.Columns[2].HeaderText = "Gider Tutarı";
                dataGridView6.Columns[3].HeaderText = "Gider Açıklaması";
                dataGridView6.Columns[4].HeaderText = "Gider Tarihi";
                dataGridView6.Columns[1].Width = 130;
                dataGridView6.Columns[2].Width = 130;
                dataGridView6.Columns[3].Width = 130;
                dataGridView6.Columns[4].Width = 130;

            }
            catch
            {
                ;
            }
        }
        public void doldurborctipi() {
            komut = new SqlCommand("select * from borc_tipi", baglan.baglan());
            komut.ExecuteNonQuery();
            SqlDataReader dr = komut.ExecuteReader();

            while (dr.Read())
            {
              
                comboBox4.Items.Add(dr["borc_tipi"].ToString());
                comboBox3.Items.Add(dr["borc_tipi"].ToString());

               

            }
        }

        private void button8_Click(object sender, EventArgs e)
        {

        }

        private void button6_Click_1(object sender, EventArgs e)
        {

        }

        private void button7_Click(object sender, EventArgs e)
        {

        }

        private void dataGridView6_MouseClick(object sender, MouseEventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {

        }

        private void gider_Tanimlari_Load(object sender, EventArgs e)
        {
            gider();
            doldurborctipi();
        }

        private void button3_Click_1(object sender, EventArgs e)
        {
            try
            {
       
                komut = new SqlCommand("insert into giderler(kategori,tutar,aciklama,tarih)values('" + comboBox3.Text + "','" + textBox7.Text + "','" + textBox6.Text + "','" + DateTime.Now.ToString() + "') ", baglan.baglan());
                komut.ExecuteNonQuery();
                MessageBox.Show("Gider Ekleme İşlemi Başarılı");




                //sira loga eklemede
   
                SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Gider Ekleme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + textBox6.Text + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
                log.ExecuteNonQuery();
         
                gider();
                temizle();


            }
            catch
            {

                ;
            }
        }

        private void button7_Click_1(object sender, EventArgs e)
        {

            // MessageBox.Show("İçeri girdi"+ dataGridView1.CurrentRow.Cells["tc_no"].Value.ToString());
           
            SqlCommand komutt = new SqlCommand("delete from giderler where id='" + dataGridView6.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
            komutt.ExecuteNonQuery();
            MessageBox.Show("Silme İşlemi Başarılı");
          

            //sira loga eklemede
        
            SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Gider Silme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + "" + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
            log.ExecuteNonQuery();
        
            gider();
            temizle();
        }

        private void button6_Click(object sender, EventArgs e)
        {

     
            comboBox4.Text = dataGridView6.CurrentRow.Cells[1].Value.ToString();
            textBox9.Text = dataGridView6.CurrentRow.Cells[2].Value.ToString();
            textBox8.Text = dataGridView6.CurrentRow.Cells[3].Value.ToString();
            tabControl1.SelectedTab = tabPage3;
        }

        private void button8_Click_1(object sender, EventArgs e)
        {

            try
            {
                double tutar = Math.Round(double.Parse(textBox9.Text));
          
                komut = new SqlCommand("update giderler set kategori = '" + comboBox4.Text + "', tutar = '" + tutar + "', aciklama = '" + textBox8.Text + "', tarih = '" + DateTime.Now.ToString() + "'where id='" + dataGridView6.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
                komut.ExecuteNonQuery();
                MessageBox.Show("Gider Güncelleme İşlemi Başarılı");
          



                //sira loga eklemede
        
                SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Gider Güncelleme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + textBox8.Text + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
                log.ExecuteNonQuery();
  
                gider();
                temizle();

            }
            catch
            {

                ;
            }
        }
    }
}
