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
    public partial class Yonetici : Form
    {
        public Yonetici()
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
        public void doldur_yetki()
        {


            SqlCommand comt = new SqlCommand("Select * from yetki where tc='" + Form1.giris + "'", baglan.baglan());
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
        private void gelirTanımlarıToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (yetki_gelir=="1")
            {
                //tıklandığında anasayfa açılacak
                gelir_Tanimlari ChildForm = new gelir_Tanimlari();

                ChildForm.MdiParent = this;

                ChildForm.Show();
            }

            else
            {
                MessageBox.Show("Yetkiniz Yok !");
            }         
        }

        private void giderTanımlarıToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (yetki_gider == "1")
            {

                //tıklandığında anasayfa açılacak
                gider_Tanimlari ChildForm = new gider_Tanimlari();

            ChildForm.MdiParent = this;

            ChildForm.Show();
            }

            else
            {
                MessageBox.Show("Yetkiniz Yok !");
            }
        }

        private void kasaTanımlarıToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (yetki_kasa == "1")
            {


                //tıklandığında anasayfa açılacak
                Kasa_Tanimlari ChildForm = new Kasa_Tanimlari();

            ChildForm.MdiParent = this;

            ChildForm.Show();
            }

            else
            {
                MessageBox.Show("Yetkiniz Yok !");
            }
        }

        private void daireİşlemleriToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (yetki_daire == "1")
            {


                //tıklandığında anasayfa açılacak
                daire_islemleri ChildForm = new daire_islemleri();

            ChildForm.MdiParent = this;

            ChildForm.Show();
            }

            else
            {
                MessageBox.Show("Yetkiniz Yok !");
            }
        }

        private void borçİşlemleriToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (yetki_borc == "1")
            {

                Borc_Islemleri ChildForm = new Borc_Islemleri();

            ChildForm.MdiParent = this;

            ChildForm.Show();
            }

            else
            {
                MessageBox.Show("Yetkiniz Yok !");
            }
        }

        private void borçlarımToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Apart_Yonetici_Borclari ChildForm = new Apart_Yonetici_Borclari();

            ChildForm.MdiParent = this;

            ChildForm.Show();
        }

        private void Yonetici_Load(object sender, EventArgs e)
        {
            doldur_yetki();
        }

        private void apartmanSakiniEkleToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Yonetici_Kul_Ekle ChildForm = new Yonetici_Kul_Ekle();

            ChildForm.MdiParent = this;

            ChildForm.Show();
        }
    }
}
