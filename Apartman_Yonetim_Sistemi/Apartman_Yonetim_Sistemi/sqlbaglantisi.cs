using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;//sql kullanma kütüphanemiz
namespace Apartman_Yonetim_Sistemi
{
    class sqlbaglantisi
    {

        public SqlConnection baglan()
        {
            SqlConnection baglanti = new SqlConnection("Data Source=.; initial Catalog=apartman; Integrated Security=true");//bağlantı kodumuz
            baglanti.Open();//bağlantıyı açıyoruz
            SqlConnection.ClearPool(baglanti);
            SqlConnection.ClearAllPools();//daha önceki açık bağlantılar vs şeyleri temizliyoruz
            return (baglanti);//bağlantıyı geri döndürüyoruz.
        }
    }
}
