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
    public partial class menu : Form
    {
        public menu()
        {
            InitializeComponent();
        }

        SqlCommand komut;
        sqlbaglantisi baglan = new sqlbaglantisi();
        SqlDataReader oku;
        public static string yetki = "";
        public static string yetki_kullanici = "0";
        public static string yetki_gider = "0";
        public static string yetki_gelir = "0";
        public static string yetki_kasa = "0";
        public static string yetki_borc = "0";
        public static string yetki_daire = "0";
        private void menu_Load(object sender, EventArgs e)
        {
            doldur_yetki();
        }
        public void doldur_yetki()
        {


            SqlCommand comt = new SqlCommand("Select * from yetki where tc='" +Form1.giris + "'", baglan.baglan());
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

        }
        private void yöneticiİşlemleriToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (yetki_kullanici=="1")
            {
                //tıklandığında anasayfa açılacak
                Apartman_Yonetici_Islemleri ChildForm = new Apartman_Yonetici_Islemleri();

                ChildForm.MdiParent = this;

                ChildForm.Show();
            }
            else
            {
                MessageBox.Show("Giriş Yetkiniz Yok!!");
            }

     
        }

        private void apartmanİşlemleriToolStripMenuItem_Click(object sender, EventArgs e)
        {
            
            Apartman_Islemleri ChildForm = new Apartman_Islemleri();

            ChildForm.MdiParent = this;

            ChildForm.Show();
        }

        private void ayarlarToolStripMenuItem_Click(object sender, EventArgs e)
        {
           
            kategori_islemleri ChildForm = new kategori_islemleri();

            ChildForm.MdiParent = this;

            ChildForm.Show();
        }

        private void istatistiklerToolStripMenuItem_Click(object sender, EventArgs e)
        {
          
            Apart_Yonetim_Anasayfa ChildForm = new Apart_Yonetim_Anasayfa();

            ChildForm.MdiParent = this;

            ChildForm.Show();
        }

        private void loglarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Loglar ChildForm = new Loglar();

            ChildForm.MdiParent = this;

            ChildForm.Show();

        }
    }
}
