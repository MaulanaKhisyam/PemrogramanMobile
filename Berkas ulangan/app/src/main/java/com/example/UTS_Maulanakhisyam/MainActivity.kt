package com.example.UTS_Maulanakhisyam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sepatulist = listOf<Sepatu>(
            Sepatu(
                R.drawable.gambar1,
                namesepatu = "Compass",
                descsepatu = "Produk lokal asal Bandung dengan design yang apik",
//                descdetailsepatu = "Pada perhelatan akbar Asian Games 2018, masyarakat Indonesia dihebohkan dengan sepatu dari Compass. " +
//                        "Banyak orang memburu sneakers asal Bandung ini karena harganya yang terjangkau dan desainnya yang apik. " +
//                        "Cukup dengan 200–300 ribu rupiah Anda sudah mendapatkan sepatu yang ciamik. " +
//                        "Popularitasnya makin menanjak setelah hadir pada acara Urban Sneaker Society tahun 2019." +
//                        "Upper berbahan canvas atau twill berpadu dengan desain simpel menjadi ciri khas sneakers ini. " +
//                        "Salah satu produk terkenalnya adalah seri Gazelle model hi-top. "
            ),
            Sepatu(
                R.drawable.gambar2,
                namesepatu = "NAH Project",
                descsepatu = "Pelopor sneakers lokal berbahan knit",
//                descdetailsepatu = "NAH Project memiliki FlexKnit. Di Indonesia, NAH Project menjadi pelopor sepatu dengan upper berbahan knit yang dinilai cocok dengan iklim tropis Indonesia. " +
//                        "Sepatu dari NAH Project bahkan pernah dibeli oleh presiden Indonesia," +
//                        "Menariknya, NAH Project juga mengusung transparency pricing kepada para pembelinya. " +
//                        "Strategi ini membuat masyarakat lebih percaya saat membeli produk ini. "
            ),
            Sepatu(
                R.drawable.gambar3,
                namesepatu = "Geoff Max",
                descsepatu = "Sepatu yang kental dengan image band punk rock dan dunia skateboarding",
//                descdetailsepatu = "Ready to kick! Itulah tagline yang diusung Geoff Max untuk menyampaikan bahwa sneakers-nya siap bersaing, baik dengan merek lokal maupun internasional. " +
//                        "Brand yang didirikan oleh Yusuf Ramdhani dan Fauzan Efwanda pada 2012 ini masih eksis hingga sekarang. " +
//                        "Geoff Max juga pernah berkolaborasi dengan merek streetwear yang sedang naik daun, yakni Thanksinsomnia." +
//                        "Produk-produk sepatu dari Geoff Max menggunakan bahan yang berkualitas, seperti semikulit, suede, atau canvas. " +
//                        "Sejak berdiri, Geoff Max pernah mensponsori beberapa musisi lokal ternama seperti Bobby SID dan Asking Alexandria. " +
//                        "Tak hanya musisi punk rock, Geoff Max juga dekat dengan komunitas skateboarding lokal."
            ),
            Sepatu(
                R.drawable.gambar4,
                namesepatu = "Ventela",
                descsepatu = "Desain sepatunya keren dan harganya terjangkau",
//                descdetailsepatu = "Satu lagi produk lokal asal Bandung yang tak kalah terkenal, yaitu Ventela. Produk ini memiliki desain sepatu yang keren dan kekinian. " +
//                        "Tak hanya itu, harga sneakers-nya juga terjangkau, berkisar 100 ribu hingga 400 ribu rupiah. " +
//                        "Apabila Anda ingin mencari sepatu sneakers dengan desain terkini, cobalah tengok koleksi dari Ventela." +
//                        "Meski begitu, Ventela hanya menjual produknya lewat reseller. " +
//                        "Mereka tidak menjual produknya secara resmi di website ataupun jaringan media sosial lainnya. Maka dari itu, " +
//                        "Anda bebas memilih reseller dengan harga terendah dan paling dekat dengan wilayah tempat tinggal Anda. "
            ),
            Sepatu(
                R.drawable.gambar5,
                namesepatu = "Sport shoes",
                descsepatu = "Sepatu yang nyaman dipakai saat berolahraga",
//                descdetailsepatu = "Sport shoes atau sepatu olahraga umumnya mengutamakan kenyamanan kaki dengan desain yang sporty. " +
//                        "Hal tersebut dimaksudkan supaya kaki dapat terhindar dari jamur akibat keringat." +
//                        " Tak heran banyak brand lokal yang merancang sepatu olahraga dengan bahan yang breathable" +
//                        "Selain itu, sepatu olahraga juga memiliki bobot yang ringan sehingga membuat kaki dapat bergerak dengan leluasa. " +
//                        "League Kumo 1.5 Mid, Kodachi 8111, dan NAH Project Flexknit V3.0 merupakan sepatu lokal tipe sport yang dapat dipilih."
            ),
            Sepatu(
                R.drawable.gambar6,
                namesepatu = "Formal shoes",
                descsepatu = "Membuat tampilan makin profesional",
//                descdetailsepatu = "Apabila Anda sering menghadiri pertemuan bisnis atau pekerja kantoran, tentu sepatu tipe ini paling pas untuk dipilih. " +
//                        "Jenis dari formal shoes pun cukup beragam, seperti pantofel, oxford, derby, loafers, dan monk strap. " +
//                        "Rata-rata formal shoes dibuat dari bahan kulit dengan tampilan yang mengilap sehingga memancarkan kesan lebih profesional."
            ),
            Sepatu(
                R.drawable.gambar7,
                namesepatu = "Casual shoes",
                descsepatu = "Sepatu yang cocok untuk daily activity",
//                descdetailsepatu = "Apabila Anda mencari sepatu yang lebih universal atau cocok dipakai untuk berbagai kegiatan, tipe casual shoes layak dipertimbangkan." +
//                        "Modelnya pun sangat beragam, sepearti model slip-ons atau sneakers dengan jenis high cut dan low cut. " +
//                        "Anda dapat memakai sepatu kasual tipe ini untuk hang out, traveling, kuliah, bahkan berkencan."
            ),
            Sepatu(
                R.drawable.gambar8,
                namesepatu = "Prabu",
                descsepatu = "Sepatu yang dijamin awet dan tidak mudah rusak",
//                descdetailsepatu = "Siapa bilang tidak bisa tampil sporty dan elegan sekaligus? Dengan sepatu keluaran Prabu ini, Anda bisa mendapatkan look keduanya. " +
//                        "Sepatu Cipta ini dibuat dari bahan cowhide leather yang pancarkan tampilan lebih mengilap. " +
//                        "Dan sepatu ini memiliki kelebihan sepatunya tergolong awet dan tidak mudah rusak, asalkan perawatannya benar" +
//                        "dan dibuat dengan jahitan side-wall-stitch construction yang membuat sepatu lebih kuat"
            ),
            Sepatu(
                R.drawable.gambar9,
                namesepatu = "Aerosteet",
                descsepatu = "Sepatu dengan tampil segar dengan sneakers bernuansa colorful",
//                descdetailsepatu = "Aerosteet mendesain sneakers ini dengan kombinasi enam warna yang memberikan kesan lebih colorful. " +
//                        "Saat memakainya, Anda akan terlihat playful dan penuh semangat. " +
//                        "Sepatu ini dirancang untuk Anda yang ingin tampil beda saat hang out bersama kawan. " +
//                        "Dan sepatu ini memiliki kelebihan Dilengkapi insole Aero Fomz yang empuk dan dapat menyesuaikan dengan bentuk telapak kaki"
            ),
            Sepatu(
                R.drawable.gambar10,
                namesepatu = "Kodachi",
                descsepatu = "Sepatu dengan modelnya simpel dengan gaya retro yang timeless",
//                descdetailsepatu = "Desain simpel sneakers Kodachi 8111 Retro tidak akan membuat Anda salah gaya. " +
//                        "Warnanya yang polos dan tiga garis di bagian samping akan membuat Anda tampil keren. " +
//                        "Anda pun bisa mengenakannya saat ke sekolah ataupun ketika jalan-jalan. Dipadukan dengan jeans atau celana jogger juga cocok, lho." +
//                        "Dan sepatu ini memiliki kelebihan nyaman dipakai untuk badminton, voli, takraw, ataupun parkur" +
//                        "dan didesain dengan sol full karet sehingga saat dipakai tidak akan mudah terpeleset"
            ),
            Sepatu(
                R.drawable.gambar11,
                namesepatu = "PATROBAS",
                descsepatu = "Sepatu dengan cara pakainya yang praktis dan nyaman dikenakan",
//                descdetailsepatu = "Sepatu dari PATROBAS yang satu ini memadukan konsep slip-ons dengan collar berbahan mesh. " +
//                        "Anda pun akan merasa lebih nyaman karena collar-nya tidak akan membuat lecet saat dipakai aktif bergerak. " +
//                        "Desain sepatunya juga dibuat simpel dengan kombinasi warna yang netral. " +
//                        "Nah, Anda yang menginginkan kepraktisan saat memakai sepatu, produk inilah jawabannya."
            ),
            Sepatu(
                R.drawable.gambar12,
                namesepatu = "League",
                descsepatu = "Sepatu tangguh yang cocok untuk kegiatan hiking!",
//                descdetailsepatu = "Jika Anda mencari sneakers lokal yang cukup tangguh untuk hiking santai, League Kumo 1.5 Mid Men ini layak dicoba. " +
//                        "Perpaduan bahan solid dan carbon rubber pada outsole-nya membuat sneakers ini memiliki daya cengkeram yang kuat. " +
//                        "Jadi, Anda tidak akan mudah terpeleset di medan yang menantang. Dengan meiliki kelebihan Lace-nya dirancang dengan fast lock lacing system sehingga tak perlu repot mengikat tali sepatu" +
//                        "daan dengan dilengkapi reflective yang akan menyala saat gelap"
            ),
            Sepatu(
                R.drawable.gambar13,
                namesepatu = "BUCCHERI",
                descsepatu = "Sepatu yang dibuat dari kulit sapi asli yang superawet",
//                descdetailsepatu = "Pilihlah pantofel ini apabila Anda mencari sepatu formal yang kuat dan tahan lama. " +
//                        "Sepatu produksi BUCCHERi ini dibuat dari bahan kulit sapi asli. Selain dikenal kuat dan kokoh, bahan ini juga tahan terhadap goresan, air, dan debu sehingga lebih mudah dibersihkan. " +
//                        "Tampilannya pun tampak lebih elegan dengan balutan warna hitam mengilap. Dan sepatu ini memiliki kelebihan dibuat menggunakan metode handmade dengan jahitan yang rapi  "
            ),
            Sepatu(
                R.drawable.gambar14,
                namesepatu = "SKECHERS GO WALK ARCH",
                descsepatu = "Sepatu yang anti air dengan arch fit Goodyear Twin-Gore Dengan Suede Overlay",
//                descdetailsepatu = "Sepatu yang anti air dengan arch fit Goodyear Twin-Gore Dengan Suede Overlay."

            ),
            Sepatu(
                R.drawable.gambar15,
                namesepatu = "Adidas Nmd R1",
                descsepatu = "Sepatu yang terinspirsi dari arsip pada tahun 80-an",
//                descdetailsepatu = "Sepatu yang terinspirsi dari arsip pada tahun 80-an, NMD dibuat untuk menghasilkan gaya sehari-hari ke siluet lari kelasik." +
//                        "Pasangan ini memamerkan kesederhanaan modern dengan tampilan monokromatik dan rajutan atas yang ramping." +
//                        "Midsole BOOTS yang responsif menambahkan kenyamanan pagi hingga malam. Bagian atas sepatu ini dibuat dengan benang nerinerja tinggi " +
//                        "yang mengandung setidaknya 50% Parley Ocean Plastic."
            ),

        )
        val recyclerView = findViewById<RecyclerView>(R.id.sepatu)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = SepatuAdapter(sepatulist)
    }
}

