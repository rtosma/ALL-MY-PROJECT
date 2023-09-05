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
    public partial class Kasa_Tanimlari : Form
    {
        public Kasa_Tanimlari()
        {
            InitializeComponent();
        }
        sqlbaglantisi baglan = new sqlbaglantisi();
        SqlCommand komut;
        string bilgisayarAdi = System.Net.Dns.GetHostName();
        string secilen = "";
        string toplamgelir = "";
        string toplamgider = "";
        double bakiye = 0;
        int hesapla;
        string _hesaplama = "";
        void yukle()
        {
           
            SqlDataAdapter ad = new SqlDataAdapter("select SUM(tutar) from gelirler ", baglan.baglan());
            DataTable dt = new DataTable();
            ad.Fill(dt);
            dataGridView8.DataSource = dt;
            toplamgelir = dataGridView8.Rows[0].Cells[0].Value.ToString();

            

       
            SqlDataAdapter ad2 = new SqlDataAdapter("select SUM(tutar) from giderler ", baglan.baglan());
            DataTable dt2 = new DataTable();
            ad2.Fill(dt2);
            dataGridView2.DataSource = dt2;
            toplamgider = dataGridView2.Rows[0].Cells[0].Value.ToString();
            bakiye = double.Parse(toplamgelir.ToString()) - double.Parse(toplamgider.ToString());
       
        }
        private void button31_Click(object sender, EventArgs e)
        {
            try
            {
              
                SqlDataAdapter ad = new SqlDataAdapter("Select * From borclar where kullanici='" + secilen + "'", baglan.baglan()   );
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView13.DataSource = dt;
       
                dataGridView13.Columns[0].Visible = false;
                dataGridView13.Columns[1].HeaderText = "Borç Kategorisi";
                dataGridView13.Columns[2].HeaderText = "TC Kimlik No";
                dataGridView13.Columns[3].HeaderText = "Borç Tutarı";
                dataGridView13.Columns[4].HeaderText = "Borç Açıklaması";
                dataGridView13.Columns[5].HeaderText = "Borç Tarihi";
                dataGridView13.Columns[1].Width = 110;
                dataGridView13.Columns[2].Width = 110;
                dataGridView13.Columns[3].Width = 110;
                dataGridView13.Columns[4].Width = 110;
                dataGridView13.Columns[5].Width = 110;
                tabControl1.SelectedTab = tabPage2;

            }
            catch
            {
                ;
            }
        }
        public void borclar() {

            try
            {

                SqlDataAdapter ad = new SqlDataAdapter("Select * From borclar", baglan.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView14.DataSource = dt;

                dataGridView14.Columns[0].Visible = false;
                dataGridView14.Columns[1].HeaderText = "Borç Kategorisi";
                dataGridView14.Columns[2].HeaderText = "TC Kimlik No";
                dataGridView14.Columns[3].HeaderText = "Borç Tutarı";
                dataGridView14.Columns[4].HeaderText = "Borç Açıklaması";
                dataGridView14.Columns[5].HeaderText = "Borç Tarihi";
                dataGridView14.Columns[1].Width = 110;
                dataGridView14.Columns[2].Width = 110;
                dataGridView14.Columns[3].Width = 110;
                dataGridView14.Columns[4].Width = 110;
                dataGridView14.Columns[5].Width = 110;
            }
            catch
            {
                ;
            }


        }
        private void Kasa_Tanimlari_Load(object sender, EventArgs e)
        {
            yukle();
            SqlCommand komutt = new SqlCommand("select * from kullanici", baglan.baglan());
            komutt.ExecuteNonQuery();
            SqlDataReader drr = komutt.ExecuteReader();
            while (drr.Read())
            {
             
                comboBox14.Items.Add(drr["tc_no"].ToString());//burda çekdi
            }
            borclar();





        }

        private void button34_Click(object sender, EventArgs e)
        {
            try
            {
                lbl1.Text = dataGridView14.CurrentRow.Cells[2].Value.ToString();
                label84.Text = dataGridView14.CurrentRow.Cells[1].Value.ToString();
                label85.Text = dataGridView14.CurrentRow.Cells[3].Value.ToString();
                panel29.Show();
            }
            catch
            {

                ;
            }
        }

        private void button32_Click(object sender, EventArgs e)
        {
            try
            {
                printDocument3.DefaultPageSettings.PaperSize = printDocument3.PrinterSettings.PaperSizes[5];
            }
            catch (Exception hata)
            {

                MessageBox.Show(hata.Message);
            }

            printDocument3.Print();
        }

        private void printDocument3_PrintPage(object sender, System.Drawing.Printing.PrintPageEventArgs ffff)
        {

            try
            {
                //ÇİZİM BAŞLANGICI
                Font myFont = new Font("Calibri", 7); //font oluşturduk
                SolidBrush sbrush = new SolidBrush(Color.Black);//fırça oluşturduk
                Pen myPen = new Pen(Color.Black); //kalem oluşturduk

                ffff.Graphics.DrawString("Düzenlenme Tarihi: " + DateTime.Now.ToLongDateString() + " " + DateTime.Now.ToLongTimeString(), myFont, sbrush, 50, 25);
                ffff.Graphics.DrawLine(myPen, 25, 45, 770, 45); // Çizgi çizdik... 1. Kalem, 2. X, 3. Y Koordinatı, 4. Uzunluk, 5. BitişX

                myFont = new Font("Calibri", 8, FontStyle.Bold);//Fatura başlığı yazacağımız için fontu kalın yaptık ve puntoyu büyütüp 15 yaptık.
                ffff.Graphics.DrawString("Borç Listesi", myFont, sbrush, 175, 65);
                ffff.Graphics.DrawLine(myPen, 25, 95, 770, 95); //çizgi çizdik.

                myFont = new Font("Calibri", 6, FontStyle.Bold); //Detay başlığını yazacağımız için fontu kalın yapıp puntoyu 10 yaptık.
                ffff.Graphics.DrawString("Kategori", myFont, sbrush, 25, 110); //Detay başlığı
                ffff.Graphics.DrawString("TC No", myFont, sbrush, 90, 110); //Detay başlığı
                ffff.Graphics.DrawString("Tutar", myFont, sbrush, 145, 110); // Detay başlığı
                ffff.Graphics.DrawString("Açıklama", myFont, sbrush, 220, 110); //Detay başlığı
                ffff.Graphics.DrawString("Tarih", myFont, sbrush, 315, 110); //Detay başlığı
                ffff.Graphics.DrawLine(myPen, 25, 125, 770, 125); //Çizgi çizdik.

                int y = 150; //y koordinatının yerini belirledik.(Verilerin yazılmaya başlanacağı yer)

                myFont = new Font("Calibri", 6); //fontu 10 yaptık.

                int i = 0;//satır sayısı için değişken tanımladık.
                while (i <= dataGridView14.Rows.Count)//döngüyü son satırda sonlandıracağız.
                {
                    ffff.Graphics.DrawString(dataGridView13[1, i].Value.ToString(), myFont, sbrush, 25, y);//1.sütun
                    ffff.Graphics.DrawString(dataGridView13[2, i].Value.ToString(), myFont, sbrush, 90, y);//2.sütun
                    ffff.Graphics.DrawString(dataGridView13[3, i].Value.ToString(), myFont, sbrush, 145, y);//3.sütun
                    ffff.Graphics.DrawString(dataGridView13[4, i].Value.ToString(), myFont, sbrush, 220, y);//4.sütun
                    ffff.Graphics.DrawString(dataGridView13[5, i].Value.ToString(), myFont, sbrush, 310, y);//5.sütun
                    y += 20; //y koordinatını arttırdık.
                    i += 1; //satır sayısını arttırdık

                    //yeni sayfaya geçme kontrolü
                    if (y > 1000)
                    {
                        ffff.Graphics.DrawString("(Devamı -->)", myFont, sbrush, 700, y + 50);
                        y = 50;
                        break; //burada yazdırma sınırına ulaştığımız için while döngüsünden çıkıyoruz
                               //çıktığımızda while baştan başlıyor i değişkeni değer almaya devam ediyor
                               //yazdırma yeni sayfada başlamış oluyor
                    }
                }
                //çoklu sayfa kontrolü
                if (i < dataGridView13.RowCount - 1)
                {
                    ffff.HasMorePages = true;
                }
                else
                {
                    ffff.HasMorePages = false;
                    i = 0;
                }
                StringFormat myStringFormat = new StringFormat();
                myStringFormat.Alignment = StringAlignment.Far;
            }
            catch
            {
            }
        }

        private void printDocument2_PrintPage(object sender, System.Drawing.Printing.PrintPageEventArgs ffff)
        {
            try
            {
                //ÇİZİM BAŞLANGICI
                Font myFont = new Font("Calibri", 7); //font oluşturduk
                SolidBrush sbrush = new SolidBrush(Color.Black);//fırça oluşturduk
                Pen myPen = new Pen(Color.Black); //kalem oluşturduk

                ffff.Graphics.DrawString("Düzenlenme Tarihi: " + DateTime.Now.ToLongDateString() + " " + DateTime.Now.ToLongTimeString(), myFont, sbrush, 50, 25);
                ffff.Graphics.DrawLine(myPen, 40, 45, 770, 45); // Çizgi çizdik... 1. Kalem, 2. X, 3. Y Koordinatı, 4. Uzunluk, 5. BitişX

                myFont = new Font("Calibri", 10, FontStyle.Bold);
                ffff.Graphics.DrawString("KASA ÇIKTISI", myFont, sbrush, 175, 65);
                ffff.Graphics.DrawLine(myPen, 40, 95, 770, 95); //çizgi çizdik.

                myFont = new Font("Calibri", 6, FontStyle.Bold); //Detay başlığını yazacağımız için fontu kalın yapıp puntoyu 10 yaptık.
                ffff.Graphics.DrawString("TOPLAM GELİR", myFont, sbrush, 40, 110); //Detay başlığı
                ffff.Graphics.DrawString("TOPLAM GİDER", myFont, sbrush, 40, 160); //Detay başlığı
                ffff.Graphics.DrawString("BAKİYE", myFont, sbrush, 40, 210); // Detay başlığı

                ffff.Graphics.DrawLine(myPen, 40, 125, 770, 125); //Çizgi çizdik.



                myFont = new Font("Calibri", 9); //fontu 10 yaptık.


                ffff.Graphics.DrawString(toplamgelir + " TL", myFont, sbrush, 40, 125);//1.sütun
                ffff.Graphics.DrawString(toplamgider + " TL", myFont, sbrush, 40, 175);//2.sütun
                ffff.Graphics.DrawString(bakiye.ToString() + " TL", myFont, sbrush, 40, 225);//3.sütun


                StringFormat myStringFormat = new StringFormat();
                myStringFormat.Alignment = StringAlignment.Far;
            }
            catch
            {
            }
        }

        private void button31_Click_1(object sender, EventArgs e)
        {

            secilen = comboBox14.Text;
       
            try
            {
             
                SqlDataAdapter ad = new SqlDataAdapter("Select * From borclar where kullanici='" + secilen + "'", baglan.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView13.DataSource = dt;
  
                dataGridView13.Columns[0].Visible = false;
                dataGridView13.Columns[1].HeaderText = "Borç Kategorisi";
                dataGridView13.Columns[2].HeaderText = "TC Kimlik No";
                dataGridView13.Columns[3].HeaderText = "Borç Tutarı";
                dataGridView13.Columns[4].HeaderText = "Borç Açıklaması";
                dataGridView13.Columns[5].HeaderText = "Borç Tarihi";
                dataGridView13.Columns[1].Width = 110;
                dataGridView13.Columns[2].Width = 110;
                dataGridView13.Columns[3].Width = 110;
                dataGridView13.Columns[4].Width = 110;
                dataGridView13.Columns[5].Width = 110;
                tabControl1.SelectedTab = tabPage2;
            }
            catch
            {
                ;
            }
        }

        private void button33_Click(object sender, EventArgs e)
        {
            _hesaplama = dataGridView14.CurrentRow.Cells[3].Value.ToString();
            string kalan = String.Format("{0:0}", Math.Round(double.Parse(_hesaplama), 0));
            hesapla = int.Parse(kalan) - int.Parse(textBox50.Text);
            MessageBox.Show("Kalan Miktar= " + hesapla.ToString());
            if (0 <= hesapla)
            {
              
                komut = new SqlCommand("update borclar set tutar -='" + textBox50.Text + "'where id = '" + dataGridView14.CurrentRow.Cells["id"].Value.ToString() + "'", baglan.baglan());
                komut.ExecuteNonQuery();

                SqlCommand odenen = new SqlCommand("insert into odenen(odeyen,miktar,odeme_turu,odeme_onaylayan) values('"+lbl1.Text+"','"+double.Parse(label85.Text)+"','"+"Elden"+"','"+Form1.giris+"')", baglan.baglan());
                odenen.ExecuteNonQuery();
                MessageBox.Show("Ödeme İşlemi Başarılı");
              

                printDocument4.Print();
                panel29.Hide();
                borclar();
            }
            else
            {
                MessageBox.Show("fazla ödeme yapdınız");
            }
        }

        private void printDocument4_PrintPage(object sender, System.Drawing.Printing.PrintPageEventArgs ffff)
        {

            try
            {
                //ÇİZİM BAŞLANGICI
                Font myFont = new Font("Calibri", 7); //font oluşturduk
                SolidBrush sbrush = new SolidBrush(Color.Black);//fırça oluşturduk
                Pen myPen = new Pen(Color.Black); //kalem oluşturduk

                ffff.Graphics.DrawString("Düzenlenme Tarihi: " + DateTime.Now.ToLongDateString() + " " + DateTime.Now.ToLongTimeString(), myFont, sbrush, 50, 25);
                ffff.Graphics.DrawLine(myPen, 40, 45, 770, 45); // Çizgi çizdik... 1. Kalem, 2. X, 3. Y Koordinatı, 4. Uzunluk, 5. BitişX

                myFont = new Font("Calibri", 10, FontStyle.Bold);
                ffff.Graphics.DrawString("Ödeme Fişi", myFont, sbrush, 175, 65);
                ffff.Graphics.DrawLine(myPen, 40, 95, 770, 95); //çizgi çizdik.

                myFont = new Font("Calibri", 6, FontStyle.Bold); //Detay başlığını yazacağımız için fontu kalın yapıp puntoyu 10 yaptık.
                ffff.Graphics.DrawString("TC NO", myFont, sbrush, 40, 110); //Detay başlığı
                ffff.Graphics.DrawString("BORÇ ADI", myFont, sbrush, 40, 160); //Detay başlığı
                ffff.Graphics.DrawString("KALAN MİKTAR", myFont, sbrush, 40, 210); // Detay başlığı


                ffff.Graphics.DrawLine(myPen, 40, 125, 770, 125); //Çizgi çizdik.



                myFont = new Font("Calibri", 9); //fontu 10 yaptık.


                ffff.Graphics.DrawString(dataGridView14.CurrentRow.Cells[2].Value.ToString(), myFont, sbrush, 40, 125);//1.sütun
                ffff.Graphics.DrawString(dataGridView14.CurrentRow.Cells[1].Value.ToString(), myFont, sbrush, 40, 175);//2.sütun
                ffff.Graphics.DrawString(hesapla + " TL", myFont, sbrush, 40, 225);//3.sütun


                StringFormat myStringFormat = new StringFormat();
                myStringFormat.Alignment = StringAlignment.Far;
            }
            catch
            {
            }
        }

        private void button30_Click(object sender, EventArgs e)
        {
            printDocument2.Print();
        }
    }
}
