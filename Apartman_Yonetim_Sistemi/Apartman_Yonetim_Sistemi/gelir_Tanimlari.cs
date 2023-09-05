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
    public partial class gelir_Tanimlari : Form
    {
        public gelir_Tanimlari()
        {
            InitializeComponent();
        }

        sqlbaglantisi baglan = new sqlbaglantisi();
        SqlCommand komut;
        string bilgisayarAdi = System.Net.Dns.GetHostName();



        public void temizle() {


            comboBox1.Text = "";
            comboBox2.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox4.Text ="";
            textBox5.Text = "";
        }
        public void combodoldur()
        {



            SqlCommand komutt = new SqlCommand("select * from kullanici", baglan.baglan());
            komutt.ExecuteNonQuery();
            SqlDataReader drr = komutt.ExecuteReader();
            while (drr.Read())
            {
                comboBox1.Items.Add(drr["tc_no"].ToString());
                comboBox2.Items.Add(drr["tc_no"].ToString());

            }




        }

        void gelir()
        {
            try
            {

                SqlDataAdapter add = new SqlDataAdapter("SELECT * FROM gelirler", baglan.baglan());
                DataTable dtt = new DataTable();
                add.Fill(dtt);
                dataGridView5.DataSource = dtt;
                dataGridView5.Columns[0].Visible = false;

                dataGridView5.Columns[0].Visible = false;
                dataGridView5.Columns[1].HeaderText = "Gelir Kategorisi";
                dataGridView5.Columns[2].HeaderText = "Gelir Tutarı";
                dataGridView5.Columns[3].HeaderText = "Gelir Açıklaması";
                dataGridView5.Columns[4].HeaderText = "Gelir Tarihi";
                dataGridView5.Columns[1].Width = 130;
                dataGridView5.Columns[2].Width = 130;
                dataGridView5.Columns[3].Width = 130;
                dataGridView5.Columns[4].Width = 130;

            }
            catch
            {
                ;
            }
        }

        private void gelir_Tanimlari_Load(object sender, EventArgs e)
        {
            gelir();
            combodoldur();
        }

        private void button2_Click(object sender, EventArgs e)
        {

            try
            {
             
                komut = new SqlCommand("insert into gelirler(kategori,tutar,aciklama,tarih)values('" + comboBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" + DateTime.Now.ToString() + "') ", baglan.baglan());
                komut.ExecuteNonQuery();
                MessageBox.Show("Gelir Ekleme İşlemi Başarılı");
               



                //sira loga eklemede
          
                SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Gelir Ekleme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + textBox3.Text + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
                log.ExecuteNonQuery();
             
                gelir();
                temizle();
            }
            catch
            {

            }
        }

        private void button4_Click(object sender, EventArgs e)
        {


            SqlCommand komutt = new SqlCommand("delete from gelirler where id='" + dataGridView5.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
            komutt.ExecuteNonQuery();
            MessageBox.Show("Silme İşlemi Başarılı");


     
            SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Gelir Silme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + "Gelir Silme İşlemi Yapılmıştır" + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
            log.ExecuteNonQuery();

            gelir();
            temizle();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            comboBox2.Text = dataGridView5.CurrentRow.Cells[1].Value.ToString();
            textBox5.Text = dataGridView5.CurrentRow.Cells[2].Value.ToString();
            textBox4.Text = dataGridView5.CurrentRow.Cells[3].Value.ToString();
            tabControl1.SelectedTab = tabPage3;
        }

        private void gnclle_btn_Click(object sender, EventArgs e)
        {
            try
            {
                double tutar = Math.Round(double.Parse(textBox5.Text));
     
                komut = new SqlCommand("update gelirler set kategori = '" + comboBox2.Text + "', tutar = '" + tutar + "', aciklama = '" + textBox4.Text + "', tarih = '" + DateTime.Now.ToString() + "'where id='" + dataGridView5.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
                komut.ExecuteNonQuery();
                MessageBox.Show("Gelir Güncelleme İşlemi Başarılı");
        



                //sira loga eklemede

                SqlCommand log = new SqlCommand("insert into log(islem,ip,tc,aciklama,tarih)values('" + "Gelir Güncelleme" + "','" + Dns.GetHostByName(bilgisayarAdi).AddressList[0].ToString() + "','" + Form1.giris + "','" + textBox4.Text + "','" + DateTime.Now.ToString() + "')", baglan.baglan());
                log.ExecuteNonQuery();
    
                gelir();
                temizle();
                gelir();
       


            }
            catch
            {

                ;
            }
        }
    }
    
}
