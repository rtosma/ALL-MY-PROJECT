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
    public partial class Apart_Yonetici_Borclari : Form
    {
        public Apart_Yonetici_Borclari()
        {
            InitializeComponent();
        }
        sqlbaglantisi baglan = new sqlbaglantisi();


        void odedigim()
        {
            try
            {
              
                SqlDataAdapter ad = new SqlDataAdapter("Select * From odenen where odeyen='" + Form1.giris + "'", baglan.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView3.DataSource = dt;

                dataGridView3.Columns[0].Visible = false;
                dataGridView3.Columns[1].HeaderText = "Ödeyenin TC NO";
                dataGridView3.Columns[2].HeaderText = "Ödenen Miktar";
                dataGridView3.Columns[3].HeaderText = "Ödeme Türü";
                dataGridView3.Columns[4].HeaderText = "Ödeme Alan TC";
                dataGridView3.Columns[1].Width = 120;
                dataGridView3.Columns[2].Width = 120;
                dataGridView3.Columns[3].Width = 110;
                dataGridView3.Columns[4].Width = 130;
            }
            catch
            {
                ;
            }
        }
        void borclarim()
        {
            try
            {
              
                SqlDataAdapter ad = new SqlDataAdapter("Select * From borclar where kullanici='" + Form1.giris + "'", baglan.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView4.DataSource = dt;

                dataGridView4.Columns[0].Visible = false;
                dataGridView4.Columns[1].HeaderText = "Borç Kategorisi";
                dataGridView4.Columns[2].HeaderText = "TC Kimlik No";
                dataGridView4.Columns[3].HeaderText = "Borç Tutarı";
                dataGridView4.Columns[4].HeaderText = "Borç Açıklaması";
                dataGridView4.Columns[5].HeaderText = "Borç Tarihi";
                dataGridView4.Columns[1].Width = 110;
                dataGridView4.Columns[2].Width = 110;
                dataGridView4.Columns[3].Width = 110;
                dataGridView4.Columns[4].Width = 110;
                dataGridView4.Columns[5].Width = 110;
            }
            catch
            {
                ;
            }
        }

        private void Apart_Yonetici_Borclari_Load(object sender, EventArgs e)
        {
            odedigim();
            borclarim();
        }

        private void button1_Click(object sender, EventArgs e)
        {


            try
            {
                printDocument1.DefaultPageSettings.PaperSize = printDocument1.PrinterSettings.PaperSizes[5];
            }
            catch (Exception hata)
            {

                MessageBox.Show(hata.Message);
            }

            printDocument1.Print();
        }
    }
}
