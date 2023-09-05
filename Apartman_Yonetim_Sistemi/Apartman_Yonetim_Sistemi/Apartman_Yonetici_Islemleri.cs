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
using System.IO;
using System.Security.Cryptography;
using System.Net;

namespace Apartman_Yonetim_Sistemi
{
    public partial class Apartman_Yonetici_Islemleri : Form
    {
        public Apartman_Yonetici_Islemleri()
        {
            InitializeComponent();
        }
        int apartman_id;
        int daire_no;
        int yonetici_id;
        SqlCommand komut;
        string kontrol = "";
        DataSet dset = new DataSet();
        string yetki_gelir = "0";
        string yetki_gider = "0";
        string yetki_kasa = "0";
        string yetki_borc = "0";
        string yetki_daire = "0";
        string yetki_kullanici = "0";
        string bilgisayarAdi = Dns.GetHostName();
        string toplammaas = "";
        string _odenen = "";
        string _borc = "";
        string toplamgelir = "";
        string toplamgider = "";
        double bakiye = 0;
        string secilen = "";
        string _hesaplama = "";
        int hesapla;
        string secili_tc;
        private string password = "1";
        sqlbaglantisi bag = new sqlbaglantisi();
        string secili_apartman_id ="0";
        void temizle() {
            textBox25.Text = "";

            textBox26.Text = "";
            maskedTextBox2.Text = "";
            maskedTextBox3.Text = "";

            textBox27.Text = "";

            textBox29.Text = "";

            textBox30.Text = "";

            textBox25.Text = "";

        }
        void kullanici2()
        {
            try
            {
          
                SqlDataAdapter ad = new SqlDataAdapter("SELECT * FROM kullanici", bag.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView10.DataSource = dt;
                dataGridView10.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
                dataGridView10.RowHeadersVisible = false; //Gizlenmesini sağlar 
                dataGridView10.Columns[8].Visible = false;
                dataGridView10.Columns[9].Visible = false;
                dataGridView10.Columns[0].Visible = false;

                dataGridView10.Columns[1].HeaderText = "TC Kimlik No";
                dataGridView10.Columns[10].HeaderText = "İsim";
                dataGridView10.Columns[2].HeaderText = "Soyisim";
                dataGridView10.Columns[3].HeaderText = "Email Adresi";
                dataGridView10.Columns[4].HeaderText = "Telefon No";
                dataGridView10.Columns[5].HeaderText = "Apartman No";
                dataGridView10.Columns[6].HeaderText = "Daire";
                dataGridView10.Columns[7].HeaderText = "Ev Durumu";


                dataGridView10.Columns[2].Width = 75;
                dataGridView10.Columns[3].Width = 62;
                dataGridView10.Columns[4].Width = 62;
                dataGridView10.Columns[5].Width = 75;
                dataGridView10.Columns[6].Width = 75;
                dataGridView10.Columns[7].Width = 75;
                dataGridView10.Columns[10].Width = 80;
               


            }
            catch
            {
                ;
            }
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
        public void doldurApartman() {

            try
            {

                SqlCommand com = new SqlCommand("Select apartman_adi from apartman_islemleri", bag.baglan());
                
                SqlDataReader oku = com.ExecuteReader();
                while (oku.Read())
                {
                    combo_apartman_adi.Items.Add(oku["apartman_adi"].ToString());           
                    comboBox1.Items.Add(oku["apartman_adi"].ToString());
                }

          



            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }



        }

        public void doldurDaire()
        {
            try
            {
                combo_daire_no.Items.Clear();
                SqlCommand com = new SqlCommand("Select id from apartman_islemleri where apartman_adi='" + combo_apartman_adi.Text + "'", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    secili_apartman_id = oku["id"].ToString();


                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }


            ////////

            try
            {
                combo_daire_no.Items.Clear();
                SqlCommand com = new SqlCommand("Select daire_no from daire where apartman_id='"+secili_apartman_id+"'", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                while (oku.Read())
                {
                    combo_daire_no.Items.Add(oku["daire_no"].ToString());
               
                   
                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }



        }


        public void doldurDaire2()
        {
            try
            {
                combo_daire_no.Items.Clear();
                SqlCommand com = new SqlCommand("Select id from apartman_islemleri where apartman_adi='" + comboBox1.Text+ "'", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    secili_apartman_id = oku["id"].ToString();


                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }


            ////////

            try
            {
                comboBox2.Items.Clear();
                SqlCommand com = new SqlCommand("Select daire_no from daire where apartman_id='" + secili_apartman_id + "'", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                while (oku.Read())
                {
                    comboBox2.Items.Add(oku["daire_no"].ToString());


                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }



        }


        private void Apartman_Yonetici_Islemleri_Load(object sender, EventArgs e)
        {
            listBox1.Items.Clear();
            groupBox1.Visible = false;
            doldurApartman();
            kullanici2();
        }

        private void combo_apartman_adi_SelectedIndexChanged(object sender, EventArgs e)
        {
            doldurDaire();
        }

        private void button15_Click(object sender, EventArgs e)
        {

            string SectigimizVeriler = "";
            try
            {
                if (textBox27.Text.Contains("@") && textBox27.Text.Contains(".com"))
                {
                    if (textBox29.Text == textBox30.Text)
                    {
                       
                        string sifrelisifre = TextSifrele(textBox30.Text);
                        komut = new SqlCommand("insert into kullanici(tc_no,ad,soyisim,email,telefon,daire_no,ev_durumu,rol,sifre,apartman_id) values('" + maskedTextBox2.Text + "','" + textBox25.Text + "','" + textBox26.Text + "','" + textBox27.Text + "','" + maskedTextBox3.Text + "','" + combo_daire_no.Text + "','" + comboBox6.Text + "','" + comboBox7.Text + "','" + sifrelisifre + "','"+secili_apartman_id+"')", bag.baglan());
                        komut.ExecuteNonQuery();
                        MessageBox.Show("Kayıt Ekleme Başarılı");
                 

                        if (comboBox7.Text == "Admin" || comboBox7.Text == "Apartman Yöneticisi")
                        {
                            if (checkedListBox1.GetItemCheckState(0) == CheckState.Checked)
                            {
                                yetki_gelir = "1";
                            }
                            else
                            {
                                yetki_gelir = "0";
                            }
                          
                            if (checkedListBox1.GetItemCheckState(1) == CheckState.Checked)
                            {
                                yetki_gider = "1";
                            }
                            else
                            {
                                yetki_gider = "0";
                            }
                            if (checkedListBox1.GetItemCheckState(2) == CheckState.Checked)
                            {
                                yetki_kasa = "1";
                            }
                            else
                            {
                                yetki_kasa = "0";
                            }
                            if (checkedListBox1.GetItemCheckState(3) == CheckState.Checked)
                            {
                                yetki_borc = "1";
                            }
                            else
                            {
                                yetki_borc = "0";
                            }
                            if (checkedListBox1.GetItemCheckState(4) == CheckState.Checked)
                            {
                                yetki_daire = "1";
                            }
                            else
                            {
                                yetki_daire = "0";
                            }
                            if (checkedListBox1.GetItemCheckState(5) == CheckState.Checked)
                            {
                                yetki_kullanici = "1";
                            }
                            else
                            {
                                yetki_kullanici = "0";
                            }

                            

                            komut = new SqlCommand("insert into yetki(tc,gelir_isleri,gider_isleri,kasa_isleri,borc_isleri,daire_isleri,kullanici_isleri) values('" + maskedTextBox2.Text+ "','" + yetki_gelir + "','" + yetki_gider + "','" + yetki_kasa + "','" + yetki_borc + "','" + yetki_daire + "','" + yetki_kullanici + "')", bag.baglan());
                            komut.ExecuteNonQuery();

                            temizle();

                        }
                    
                     
                        kullanici2();
                    }
                    else
                    {
                        MessageBox.Show("Şifreler Eşleşmiyor");
                    }


                }
                else
                {
                    MessageBox.Show("Lütfen Gerçek Bir Email Giriniz");
                }



            }
            catch (Exception hata)
            {

                MessageBox.Show("Bir hatanız var ! " + hata.Message);
            }
        }

        private void button19_Click(object sender, EventArgs e)
        {
            secili_tc = dataGridView10.CurrentRow.Cells[1].Value.ToString();
            textBox38.Text = secili_tc;
            tabControl1.SelectedTab = tabPage2;
  
        }

        private void button16_Click(object sender, EventArgs e)
        {
            string apartadi="";
            try
            {
                combo_daire_no.Items.Clear();
                SqlCommand com = new SqlCommand("Select apartman_adi from apartman_islemleri where id='" + dataGridView10.CurrentRow.Cells[5].Value.ToString() + "'", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    apartadi = oku["apartman_adi"].ToString();


                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }

            maskedTextBox5.Text= dataGridView10.CurrentRow.Cells[1].Value.ToString();   //tc
            textBox37.Text= dataGridView10.CurrentRow.Cells[10].Value.ToString();   //isim
            textBox36.Text = dataGridView10.CurrentRow.Cells[2].Value.ToString(); //soyisim
            textBox35.Text = dataGridView10.CurrentRow.Cells[3].Value.ToString(); //email
            maskedTextBox4.Text = dataGridView10.CurrentRow.Cells[4].Value.ToString() ; //telefon
                                                                                        //  textBox34.Text = ""; //daire no
            comboBox1.Text = apartadi; //apartman adi
            comboBox2.Text = dataGridView10.CurrentRow.Cells[6].Value.ToString();//daire no
            comboBox9.Text = dataGridView10.CurrentRow.Cells[7].Value.ToString();//durum
            comboBox8.Text = dataGridView10.CurrentRow.Cells[8].Value.ToString();//rol
            textBox33.Text= TextSifreCoz(dataGridView10.CurrentRow.Cells[9].Value.ToString());//şifreler
            textBox32.Text =TextSifreCoz(dataGridView10.CurrentRow.Cells[9].Value.ToString());// şifreler

            tabControl1.SelectedTab = tabPage4;
        }

        private void tabControl1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void combo_daire_no_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            doldurDaire2();
        }

        private void button18_Click(object sender, EventArgs e)
        {

        }

        private void button20_Click(object sender, EventArgs e)
        {
            try
            {
                combo_daire_no.Items.Clear();
                SqlCommand com = new SqlCommand("Select id from apartman_islemleri where apartman_adi='" + comboBox1.Text + "'", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                if (oku.Read())
                {
                    secili_apartman_id = oku["id"].ToString();


                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Apartman Listeleme Hatası ! " + hata.Message);
            }

            string sifrelisifre = TextSifrele(textBox33.Text);
            SqlCommand komutum = new SqlCommand("update kullanici set tc_no = '" + maskedTextBox5.Text + "', ad = '" + textBox37.Text + "',soyisim = '" + textBox36.Text + "',email='" + textBox35.Text + "',telefon='" + maskedTextBox4.Text + "',daire_no='" + comboBox2.Text + "',ev_durumu='" + comboBox9.Text + "',rol='" + comboBox8.Text + "',sifre='" + sifrelisifre + "',apartman_id='"+ secili_apartman_id + "'  where tc_no='" + dataGridView10.CurrentRow.Cells["tc_no"].Value.ToString() + "'", bag.baglan());
            komutum.ExecuteNonQuery();
            MessageBox.Show("Güncelleme İşlemi Başarılı");
         
            kullanici2();
            maskedTextBox5.Text = "";   //tc
            textBox37.Text = "";   //isim
            textBox36.Text = ""; //soyisim
            textBox35.Text = ""; //email
            maskedTextBox4.Text = ""; //telefon
                                                                                       //  textBox34.Text = ""; //daire no
        
            comboBox2.Text = "";//daire no
            comboBox9.Text = "";//durum
            comboBox8.Text = "";//rol
            textBox33.Text = "";//şifreler
            textBox32.Text = "";// şifreler


        }

        private void button21_Click(object sender, EventArgs e)
        {
            try
            {
                string yetki_gelir1 = "0";
                string yetki_gider1 = "0";
                string yetki_kasa1 = "0";
                string yetki_borc1 = "0";
                string yetki_daire1 = "0";
                string yetki_kullanici1 = "0";
                if (checkedListBox2.GetItemCheckState(0) == CheckState.Checked)
                {
                    yetki_gelir1 = "1";
                }
                else
                {
                    yetki_gelir1 = "0";
                }

                if (checkedListBox2.GetItemCheckState(1) == CheckState.Checked)
                {
                    yetki_gider1 = "1";
                }
                else
                {
                    yetki_gider1 = "0";
                }
                if (checkedListBox2.GetItemCheckState(2) == CheckState.Checked)
                {
                    yetki_kasa1 = "1";
                }
                else
                {
                    yetki_kasa1 = "0";
                }
                if (checkedListBox2.GetItemCheckState(3) == CheckState.Checked)
                {
                    yetki_borc1 = "1";
                }
                else
                {
                    yetki_borc1 = "0";
                }
                if (checkedListBox2.GetItemCheckState(4) == CheckState.Checked)
                {
                    yetki_daire1 = "1";
                }
                else
                {
                    yetki_daire1 = "0";
                }
                if (checkedListBox2.GetItemCheckState(5) == CheckState.Checked)
                {
                    yetki_kullanici1 = "1";
                }
                else
                {
                    yetki_kullanici1 = "0";
                }




                SqlCommand komutum = new SqlCommand("update yetki set gelir_isleri = '" + yetki_gelir1 + "',gider_isleri = '" + yetki_gider1 + "',kasa_isleri = '" + yetki_kasa1 + "',borc_isleri='" + yetki_borc1 + "',daire_isleri='" + yetki_daire1 + "',kullanici_isleri='" + yetki_kullanici1 + "'  where tc='" + textBox38.Text + "'", bag.baglan());
                komutum.ExecuteNonQuery();
        
                MessageBox.Show("Yetkiler Başarıyla Değiştirildi");

                temizle();
                kullanici2();
           
            }
            catch (Exception hata)
            {

                MessageBox.Show(hata.Message);
            }
        }

        private void button17_Click(object sender, EventArgs e)
        {
       
            SqlCommand komutt = new SqlCommand("delete from kullanici where tc_no='" + dataGridView10.CurrentRow.Cells["tc_no"].Value.ToString() + "'", bag.baglan());
            komutt.ExecuteNonQuery();
            MessageBox.Show("Silme İşlemi Başarılı");
          
            kullanici2();
        
        }


        //////////////////
        public void dinamik_yetkilendirme()
        {
            using (SqlCommand m = new SqlCommand("select * from apartman_islemleri order by id", bag.baglan()))
            {
               int i = 0;
                int EklenenButonlar_Height =80;
                int Soldan = 0, Ustten = 0;

                SqlDataReader oku = m.ExecuteReader();
                while (oku.Read())
                {
                    ////d = Convert.ToInt32(oku["Durumu"]);
                    Button btn = new Button();
                    Name = "btn_" + (i + 1).ToString();
                    btn.ForeColor = Color.Black;
                    btn.Text =  oku["apartman_adi"].ToString();
                    btn.Size = new System.Drawing.Size(200, 80);
                    btn.Font = new Font(btn.Font.Name, btn.Font.Size, FontStyle.Bold);
                    btn.ForeColor = Color.Black;
                    btn.FlatStyle = FlatStyle.Flat;
                    btn.TextAlign = ContentAlignment.MiddleLeft;
                    btn.Image = Apartman_Yonetim_Sistemi.Properties.Resources.Apartment_icon;
                    btn.ImageAlign = ContentAlignment.MiddleRight;
                    btn.Tag = Convert.ToInt32(oku["id"]);
                    btn.Click += Btn_Click;
                    tabPage5.Controls.Add(btn);
                 
                    i++;
                    Ustten = (btn.Height * (EklenenButonlar_Height / btn.Height));
                    // dikeyde eklenen butonların yüksekliklerinden yola çıkarak, üstten bırakılacak boşluğu buluyoruz                

                    EklenenButonlar_Height += btn.Height;
                    // eklenen butonların dikeyde toplam boyutu kaç piksel?
                    // bu değeri, panel yüksekliği  ile dikeyde eklenen butonların toplam yüksekliği değerlerini karşılaştırdıktan sonra
                    // dikeyde yer kalmadıysai, sağına geçip devam etmesi için alıyoruz.

                    switch (EklenenButonlar_Height > tabPage5.Height)
                    // butonların boyutu ekrana sığmıyorsa?
                    {
                        case true:
                            Ustten = 0;
                            // en üstten başla

                            Soldan += btn.Width;
                            // soldan buton genişliği kadar boşluk bırak.
                            // bir stun boyunca ekledikten sonra sağına geçip devam edecek
                            // ama soldan kaç pksel boşluk bırakacak onu burada belirliyoruz.

                            EklenenButonlar_Height = btn.Height;
                            // ikinci stuna geçtiğimizden dolayı sıfırladık
                            break;
                    }
                    btn.Location = new Point(Soldan + 10, Ustten + 10); // konumunu ayarladık
                                                                        // dediğimiz gibi buton eklendikten sonra konumu ayarlanabilir.

                }
            }
        }

        public void dinamik_daireler()
        {
            using (SqlCommand m = new SqlCommand("select * from daire  where apartman_id='"+ apartman_id + "'order by id", bag.baglan()))
            {
                int i = 0;
                int EklenenButonlar_Height = 0;
                int Soldan = 0, Ustten = 0;

                SqlDataReader oku = m.ExecuteReader();
                while (oku.Read())
                {
                    ////d = Convert.ToInt32(oku["Durumu"]);
                    Button btn = new Button();
                    Name = "btn1_" + (i + 1).ToString();
                    btn.ForeColor = Color.Black;
                    btn.Text = "Daire Tipi : "+oku["tipi"].ToString()+" Daire No : "+oku["daire_no"];
                    btn.Size = new System.Drawing.Size(275, 75);
                    btn.Font = new Font(btn.Font.Name, btn.Font.Size, FontStyle.Bold);
                    btn.ForeColor = Color.Black;
                    btn.FlatStyle = FlatStyle.Flat;
                    btn.TextAlign = ContentAlignment.MiddleLeft;
                    btn.Image = Apartman_Yonetim_Sistemi.Properties.Resources._11874_family_man_woman_girl_boy_icon__1_;
                    btn.ImageAlign = ContentAlignment.MiddleRight;
                    btn.Tag = Convert.ToInt32(oku["daire_no"]);
                    btn.Click += Btn1_Click;
                    panel_evde_yasayanlar.Controls.Add(btn);
                    i++;
                    Ustten = (btn.Height * (EklenenButonlar_Height / btn.Height));
                    // dikeyde eklenen butonların yüksekliklerinden yola çıkarak, üstten bırakılacak boşluğu buluyoruz                

                    EklenenButonlar_Height += btn.Height;
                    // eklenen butonların dikeyde toplam boyutu kaç piksel?
                    // bu değeri, panel yüksekliği  ile dikeyde eklenen butonların toplam yüksekliği değerlerini karşılaştırdıktan sonra
                    // dikeyde yer kalmadıysai, sağına geçip devam etmesi için alıyoruz.

                    switch (EklenenButonlar_Height > tabPage5.Height)
                    // butonların boyutu ekrana sığmıyorsa?
                    {
                        case true:
                            Ustten = 0;
                            // en üstten başla

                            Soldan += btn.Width;
                            // soldan buton genişliği kadar boşluk bırak.
                            // bir stun boyunca ekledikten sonra sağına geçip devam edecek
                            // ama soldan kaç pksel boşluk bırakacak onu burada belirliyoruz.

                            EklenenButonlar_Height = btn.Height;
                            // ikinci stuna geçtiğimizden dolayı sıfırladık
                            break;
                    }
                    btn.Location = new Point(Soldan + 10, Ustten + 10); // konumunu ayarladık
                                                                        // dediğimiz gibi buton eklendikten sonra konumu ayarlanabilir.

                }
            }
        }
        private void Btn_Click(object sender, EventArgs e)
        {
            Button btn = sender as Button;
        //    MessageBox.Show(btn.Tag.ToString());
            apartman_id =int.Parse(btn.Tag.ToString());
            panel_evde_yasayanlar.Show();
            dinamik_daireler();

        }
        private void Btn1_Click(object sender, EventArgs e)
        {
            listBox1.Items.Clear();
            Button btn = sender as Button;
          //  MessageBox.Show(btn.Tag.ToString());
            daire_no = int.Parse(btn.Tag.ToString());

            doldurKullanici(daire_no,apartman_id);
            groupBox1.Visible = true;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //apartmanın dairesinde yaşayanları kaydettiğimiz listboxu temizliyoruz
            listBox1.Items.Clear();
            groupBox1.Visible = false;
            panel_evde_yasayanlar.Controls.Clear(); //tüm kontrolleri siliyoruz
            panel_evde_yasayanlar.Visible = false;
            dinamik_yetkilendirme();
        }

        public void doldurKullanici(int daire_no,int apartman_id)
        {

            try
            {

                SqlCommand com = new SqlCommand("Select * from kullanici where daire_no='"+daire_no+"' and apartman_id='"+apartman_id+"'", bag.baglan());

                SqlDataReader oku = com.ExecuteReader();
                while (oku.Read())
                {
                    listBox1.Items.Add("ID "+oku["id"].ToString()+" "+oku["tc_no"].ToString() + " Adı Soyadı "+oku["ad"].ToString()+" "+ oku["soyisim"].ToString()+" Ev Durumu : "+ oku["ev_durumu"].ToString()+" "+"Rol"+" " + oku["rol"].ToString());
                
                }





            }
            catch (Exception hata)
            {

                MessageBox.Show("Kullanıcı Listeleme Hatası ! " + hata.Message);
            }




        }

        private void button2_Click(object sender, EventArgs e)
        {
            string[] isim = listBox1.SelectedItem.ToString().Split(' ');
          //  MessageBox.Show(isim[1]+" "+isim[2]);
            SqlCommand komutum = new SqlCommand("update kullanici set rol='" + "Apartman Yöneticisi" + "'  where tc_no='" + isim[2]  + "'", bag.baglan());
            komutum.ExecuteNonQuery();

            //  MessageBox.Show(isim[1]+" "+isim[2]);
            SqlCommand komutum2 = new SqlCommand("update apartman_islemleri set yonetici_id='" + isim[1] + "'  where id='" + apartman_id + "'", bag.baglan());
            komutum2.ExecuteNonQuery();
            MessageBox.Show(isim[5] +" "+isim[6] +" Apartman Yönetici olarak Başarılı Şekilde Görevlendirildi");
        }

        private void button3_Click(object sender, EventArgs e)
        {

            string[] isim = listBox1.SelectedItem.ToString().Split(' ');
           // MessageBox.Show(isim[13]);
            if (isim[10] != "apartman")
            {
                SqlCommand komutum = new SqlCommand("update kullanici set rol='" + "Sakin" + "'  where tc_no='" + isim[2] + "'", bag.baglan());
                komutum.ExecuteNonQuery();
                MessageBox.Show(isim[3] + " " + isim[4] + " Apartman Yönetici Görevinden olarak Başarılı Şekilde Çıkarıldı");
            }
            else
            {
                MessageBox.Show("Kullanıcı Apartman Yönetici Değil !");
            }
    
        }

        private void textBox31_TextChanged(object sender, EventArgs e)
        {

            try
            {

                SqlDataAdapter ad = new SqlDataAdapter("SELECT * FROM kullanici where tc_no LIKE '%" + textBox31.Text+ "%'", bag.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView10.DataSource = dt;
                dataGridView10.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
                dataGridView10.RowHeadersVisible = false; //Gizlenmesini sağlar 
                dataGridView10.Columns[8].Visible = false;
                dataGridView10.Columns[9].Visible = false;
                dataGridView10.Columns[0].Visible = false;

                dataGridView10.Columns[1].HeaderText = "TC Kimlik No";
                dataGridView10.Columns[10].HeaderText = "İsim";
                dataGridView10.Columns[2].HeaderText = "Soyisim";
                dataGridView10.Columns[3].HeaderText = "Email Adresi";
                dataGridView10.Columns[4].HeaderText = "Telefon No";
                dataGridView10.Columns[5].HeaderText = "Apartman No";
                dataGridView10.Columns[6].HeaderText = "Daire";
                dataGridView10.Columns[7].HeaderText = "Ev Durumu";


                dataGridView10.Columns[2].Width = 75;
                dataGridView10.Columns[3].Width = 62;
                dataGridView10.Columns[4].Width = 62;
                dataGridView10.Columns[5].Width = 75;
                dataGridView10.Columns[6].Width = 75;
                dataGridView10.Columns[7].Width = 75;
                dataGridView10.Columns[10].Width = 80;



            }
            catch
            {
                ;
            }
        }
    }
}
