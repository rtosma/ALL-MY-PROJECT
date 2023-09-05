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
    public partial class Loglar : Form
    {
        public Loglar()
        {
            InitializeComponent();
        }
        sqlbaglantisi baglan = new sqlbaglantisi();
        void LOG()
        {
            try
            {
               
                SqlDataAdapter ad = new SqlDataAdapter("SELECT * FROM log ORDER BY id DESC", baglan.baglan());
                DataTable dt = new DataTable();
                ad.Fill(dt);
                dataGridView7.DataSource = dt;
                dataGridView7.Columns[0].Visible = false;
              
                dataGridView7.Columns[1].HeaderText = "Gerçekleştirilen İşlem";
                dataGridView7.Columns[2].HeaderText = "İpi Adresi";
                dataGridView7.Columns[3].HeaderText = "TC Numarası";
                dataGridView7.Columns[4].HeaderText = "İşlem Açıklaması";
                dataGridView7.Columns[5].HeaderText = "İşlem Tarihi";
                dataGridView7.Columns[1].Width = 115;
                dataGridView7.Columns[2].Width = 110;
                dataGridView7.Columns[3].Width = 110;
                dataGridView7.Columns[4].Width = 112;
                dataGridView7.Columns[5].Width = 110;
            }
            catch
            {
                ;
            }
        }

        private void textBox15_TextChanged(object sender, EventArgs e)
        {
            DataTable dt = new DataTable();
            SqlDataAdapter ad = new SqlDataAdapter("SELECT * FROM log WHERE islem LIKE'%" + textBox15.Text + "%' or ip LIKE '%" + textBox15.Text + "%' or tc LIKE '%" + textBox15.Text + "%'or aciklama LIKE '%" + textBox15.Text + "%'OR tarih LIKE '%" + textBox15.Text + "%' ", baglan.baglan());
            ad.Fill(dt);
            dataGridView7.DataSource = dt;
        }

        private void Loglar_Load(object sender, EventArgs e)
        {
            LOG();
        }
    }
}
