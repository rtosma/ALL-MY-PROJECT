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

namespace otopark_otomasyonu
{
    public partial class frmaraçotoparkyerleri : Form
    {
        public frmaraçotoparkyerleri()
        {
            InitializeComponent();
        }

        SqlConnection baglanti = new SqlConnection("Data Source = msi-laptop-rt;Initial Catalog=araç_otopark;Integer");

        private void frmaraçotoparkyerleri_Load(object sender, EventArgs e)
        {
            int sayac = 1;
            foreach (Control item in Controls)
            {
                if(item is Button)
                {
                    item.Text = "P-" + sayac;
                    item.Name = "P-" + sayac;
                    sayac++;
                }
            }
        }
    }
}
