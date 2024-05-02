package com.example.yourwordcollection.navigationcomponent.fragment.main.model

import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.model.Word
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Alphabet(
    val name:String? = null,
    val wordLists:Array<Word>? = null
) : Parcelable {
    fun getAlphabetData() : List<Alphabet> {
        return listOf(
            Alphabet(
                name = "A",
                wordLists = arrayOf(
                    Word(
                        name = "Awan",
                        imgUrl = "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2022/05/24/clouds-2329680_1280jpg-20220524084248.jpg"
                    ),
                    Word(
                        name = "Api",
                        imgUrl = "https://awsimages.detik.net.id/community/media/visual/2022/02/03/ilustrasi-api.jpeg?w=1200"
                    ),
                    Word(
                        name = "Air",
                        imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5Qbkx4Hecliy3UPSgUnkEA5xSKvESe9bkR-S4OUkt7Q&s"
                    ),
                    Word(
                        name = "Avatar",
                        imgUrl = "https://cdn.antaranews.com/cache/1200x800/2023/06/18/20230618_080945.jpg"
                    ),
                )
            ),
            Alphabet(
                name = "B",
                wordLists = arrayOf(
                    Word(
                        name = "Bambu",
                        imgUrl = "https://awsimages.detik.net.id/community/media/visual/2016/04/18/09255641-bc49-4fe4-8dd8-a1b669ffcacb.jpg?w=600&q=90"
                    ),
                    Word(
                        name = "Batu Bara",
                        imgUrl = "https://awsimages.detik.net.id/visual/2021/11/22/aktivitas-bongkar-muat-batu-bara-11_169.jpeg?w=650"
                    ),
                    Word(
                        name = "Baling-baling Bambu",
                        imgUrl = "https://img.ws.mms.shopee.co.id/1b07274a86964fad45fd48d725cd8123"
                    ),
                    Word(
                        name = "Batman",
                        imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZXmjPSrlN0CrrLKezFoQKpAPXKwqw54RUYTz0qD0D-g&s"
                    ),
                )
            ),
            Alphabet(
                name = "C",
                wordLists = arrayOf(
                    Word(
                        name = "Cherry",
                        imgUrl = "https://i.pinimg.com/736x/4c/c1/ee/4cc1eee2356913b574a8fbafa16d5acd.jpg"
                    ),
                    Word(
                        name = "Cherrybelle",
                        imgUrl = "https://i.scdn.co/image/ab67616d0000b273fd5999a280230b968199cf54"
                    ),
                    Word(
                        name = "Changcuters",
                        imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTflShk1uNfc9ECbGuwN_Iy7LQFXnpO4Nwk9ndEusR38g&s"
                    ),
                    Word(
                        name = "Cepmek",
                        imgUrl = "https://awsimages.detik.net.id/community/media/visual/2022/11/08/tiktokers-viral-populerkan-gaya-rambut-cepmek-dan-jargon-kadang-kadang-ente-8_34.jpeg?w=375"
                    ),
                )
            ),
            Alphabet(
                name = "D",
                wordLists = arrayOf(
                    Word(
                        name = "Dadu",
                        imgUrl = "https://i.pinimg.com/564x/91/64/d3/9164d3ec2bc19742d831f0b9a20a0de5.jpg"
                    ),
                    Word(
                        name = "Doraemon",
                        imgUrl = "https://radarbanyumas.disway.id/upload/2022/04/fakta-Doraemon.jpg"
                    ),
                    Word(
                        name = "Durian",
                        imgUrl = "https://4.imimg.com/data4/FF/FF/GLADMIN-/durian-fruit-500x500.jpg"
                    ),
                    Word(
                        name = "Dora",
                        imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTT9zBqQ2jdZVQJ56IlLvNRDGMROx8ODshM1OK65BtHVQ&s"
                    ),
                )
            ),
            Alphabet(
                name = "E",
                wordLists = arrayOf(
                    Word(
                        name = "Emoticon",
                        imgUrl = "https://as2.ftcdn.net/v2/jpg/02/74/59/65/1000_F_274596599_EBstUBPBs32oVZMW1MOrvVUpe8YrtQyx.jpg"
                    ),
                    Word(
                        name = "Emosi",
                        imgUrl = "https://asset.kompas.com/crops/1ZZTmOjYqsGIP88AV-RCyoLmoo4=/0x0:780x390/750x500/data/photo/2012/08/31/1618022780x390.jpg"
                    ),
                    Word(
                        name = "Ekosistem",
                        imgUrl = "https://img.inews.co.id/media/600/files/inews_new/2022/09/25/ilustrasi_ekosistem.jpg"
                    ),
                    Word(
                        name = "Empati",
                        imgUrl = "https://kelanakids.com/wp-content/uploads/2022/04/Cara-Mengajarkan-Sikap-Empati-Pada-Anak-Usia-Dini.jpg"
                    ),
                )
            ),
            Alphabet(
                name = "F",
                wordLists = arrayOf(
                    Word(
                        name = "Frankenstein",
                        imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1jOFVLap2D6I0mWHdnAA6Vt3KE-22rWscdijkHdYMAw&s"
                    ),
                    Word(
                        name = "Ferrari",
                        imgUrl = "https://imgcdn.oto.com/large/gallery/exterior/10/2213/ferrari-sf90-stradale-front-angle-low-view-433345.jpg"
                    ),
                    Word(
                        name = "Fantastic Four",
                        imgUrl = "https://m.media-amazon.com/images/I/A1deeg7Nx+L._AC_UF894,1000_QL80_.jpg"
                    ),
                    Word(
                        name = "Farm",
                        imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkdSQNwEtM1w6KfNOkYk6O4Y9qYmm3l9QjqyhHg1-9sQ&s"
                    ),
                )
            ),
            Alphabet(
                name = "G",
                wordLists = arrayOf(
                    Word(
                        name = "Gem",
                        imgUrl = "https://cdn-difln.nitrocdn.com/RhGgIzTmiXjwbtwwtHDWcsddooFiyhcI/assets/images/optimized/rev-34b43f1/www.iconicjewelry.com/app/uploads/2017/07/red-gem-1-1024x1024.png"
                    ),
                    Word(
                        name = "Gorilla",
                        imgUrl = "https://i.natgeofe.com/n/abf58ec8-ac78-4108-adbe-918fa5bda2e5/mountain-gorilla_3x4.jpg"
                    ),
                    Word(
                        name = "Giraffe",
                        imgUrl = "https://images.ctfassets.net/81iqaqpfd8fy/3r4flvP8Z26WmkMwAEWEco/870554ed7577541c5f3bc04942a47b95/78745131.jpg?w=1200&h=1200&fm=jpg&fit=fill"
                    ),
                    Word(
                        name = "Goat",
                        imgUrl = "https://d.newsweek.com/en/full/2303646/baby-goat.webp?w=1600&h=900&q=88&f=32b78ef566c14f9508c18a381e256cc7"
                    ),
                )
            ),
            Alphabet(
                name = "H",
                wordLists = arrayOf(
                    Word(
                        name = "Hamster",
                        imgUrl = "https://www.burgesspetcare.com/wp-content/uploads/2024/01/Hamster.jpg"
                    ),
                    Word(
                        name = "Harp",
                        imgUrl = "https://cdn.britannica.com/90/210490-050-34704C4C/woman-harp.jpg"
                    ),
                    Word(
                        name = "Hand",
                        imgUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Hand_Model.jpg/800px-Hand_Model.jpg"
                    ),
                    Word(
                        name = "Hammer",
                        imgUrl = "https://images.tokopedia.net/img/cache/700/VqbcmM/2023/5/15/0fa6cda4-3865-402b-9882-ab6ac1f7fd7e.jpg"
                    ),
                )
            ),
            Alphabet(
                name = "I",
                wordLists = arrayOf(
                    Word(
                        name = "Ice",
                        imgUrl = "https://cdn.shopify.com/s/files/1/0180/9499/files/ice_image_large.jpg?v=1491507919"
                    ),
                    Word(
                        name = "Idea",
                        imgUrl = "https://img.freepik.com/free-vector/businessman-get-idea_1133-350.jpg?size=338&ext=jpg&ga=GA1.1.1700460183.1713398400&semt=sph"
                    ),
                    Word(
                        name = "Identity",
                        imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNanWt5ad64tvvJjliJusZ5Vleb4Mjm8JJZCyFUXHtew&s"
                    ),
                    Word(
                        name = "Isolation",
                        imgUrl = "https://www.newportacademy.com/wp-content/uploads/man-in-gray-shirt-looking-at-city-buildings-3625023.jpg"
                    ),
                )
            ),
            Alphabet(
                name = "J",
                wordLists = arrayOf(
                    Word(
                        name = "Jam",
                        imgUrl = "https://i0.wp.com/www.pardonyourfrench.com/wp-content/uploads/2022/05/strawberry-jam-5.jpg?resize=585%2C585&ssl=1"
                    ),
                    Word(
                        name = "Juice",
                        imgUrl = "https://www.spiceupthecurry.com/wp-content/uploads/2022/03/strawberry-juice-1.jpg"
                    ),
                    Word(
                        name = "Jet",
                        imgUrl = "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/rockcms/2023-09/230921-f-35-mn-0850-92f318.jpg"
                    ),
                    Word(
                        name = "Journey",
                        imgUrl = "https://tuvv.telkomuniversity.ac.id/wp-content/uploads/2014/10/city-road-street-italy-1.jpg"
                    ),
                )
            ),
            Alphabet(
                name = "K",
                wordLists = arrayOf(
                    Word(
                        name = "Kingdom",
                        imgUrl = "https://a.cdn-hotels.com/gdcs/production12/d1130/83f1c8c6-e12d-4e69-8433-c5bbc90b5ad6.jpg"
                    ),
                    Word(
                        name = "Kid",
                        imgUrl = "https://image.cnbcfm.com/api/v1/image/107203114-1677872178166-GettyImages-1382525205.jpg?v=1677940236&w=929&h=523&vtcrop=y"
                    ),
                    Word(
                        name = "Kite",
                        imgUrl = "https://5.imimg.com/data5/SELLER/Default/2023/2/DN/TL/DC/63424135/tiranga-paper-kite-500x500.jpg"
                    ),
                    Word(
                        name = "Kairo",
                        imgUrl = "https://static.republika.co.id/uploads/images/inpicture_slide/al-fustat-kairo_210731202231-912.jpg"
                    ),
                )
            ),
            Alphabet(
                name = "L",
                wordLists = arrayOf(
                    Word(
                        name = "Lasagna",
                        imgUrl = "https://assets.bonappetit.com/photos/656f48d75b552734225041ba/1:1/w_3129,h_3129,c_limit/20231120-WEB-Lasanga-6422.jpg"
                    ),
                    Word(
                        name = "Lamborgini",
                        imgUrl = "https://cdn.motor1.com/images/mgl/88Xjq/s1/lamborghini-sc20.webp"
                    ),
                    Word(
                        name = "Longitude",
                        imgUrl = "https://cdn.britannica.com/63/2063-050-89E52B49/Perspective-globe-grid-parallels-meridians-longitude-latitude.jpg"
                    ),
                    Word(
                        name = "Loaf",
                        imgUrl = "https://thepracticalkitchen.com/wp-content/uploads/2023/07/brioche-bread-loaf-1x1-3219.jpg"
                    ),
                )
            ),
            Alphabet(
                name = "M",
                wordLists = arrayOf(
                    Word(
                        name = "Master Chef",
                        imgUrl = "https://m.media-amazon.com/images/M/MV5BMTEyMzlkODgtYmUxYS00M2M0LTljMDItNzI5OGFlZTc5ZDFkXkEyXkFqcGdeQXVyODk4Nzg5NjE@._V1_.jpg"
                    ),
                    Word(
                        name = "Mysery",
                        imgUrl = "https://static.independent.co.uk/s3fs-public/thumbnails/image/2017/07/12/14/angry-istock.jpg?width=1200"
                    ),
                    Word(
                        name = "Magazine",
                        imgUrl = "https://res.cloudinary.com/bloomsbury-atlas/image/upload/w_568,c_scale/jackets/9781501394966.jpg"
                    ),
                    Word(
                        name = "Mowhawk",
                        imgUrl = "https://content.latest-hairstyles.com/wp-content/uploads/naturally-textured-faded-mohawk-for-men.jpg"
                    ),
                )
            ),
            Alphabet(
                name = "N",
                wordLists = arrayOf(
                    Word(
                        name = "Nail",
                        imgUrl = "https://cdnwpseller.gramedia.com/wp-content/uploads/2023/04/Polished_purple_nails_with_nail_art_on-scaled.jpg"
                    ),
                    Word(
                        name = "North",
                        imgUrl = "https://thumbs.dreamstime.com/z/north-arrow-icon-n-direction-navigation-point-symbol-vector-logo-circle-gps-navigator-map-north-arrow-icon-n-125994654.jpg"
                    ),
                    Word(
                        name = "Norm",
                        imgUrl = "https://play-lh.googleusercontent.com/tI9SC37Awv0UzdEf3MqGXPlmk9fW9bUgoKoap5jChOTm6YzSNPhaSR_VQCsBmfHutmiv"
                    ),
                    Word(
                        name = "Nobel",
                        imgUrl = "https://upload.wikimedia.org/wikipedia/id/e/ed/Nobel_Prize.png"
                    ),
                )
            ),
            Alphabet(
                name = "O",
                wordLists = arrayOf(
                    Word(
                        name = "Oat",
                        imgUrl = "https://assets.klikindomaret.com/share/10025301_1.jpg"
                    ),
                    Word(
                        name = "Ornamen",
                        imgUrl = "https://mir-s3-cdn-cf.behance.net/projects/404/47109c149234097.62e38a8b5efe4.jpg"
                    ),
                    Word(
                        name = "Orchestra",
                        imgUrl = "https://i.ytimg.com/vi/DPFcSJEmJxc/maxresdefault.jpg"
                    ),
                    Word(
                        name = "OMG",
                        imgUrl = "https://cdn-icons-png.flaticon.com/512/8819/8819074.png"
                    ),
                )
            ),
        )
    }
}
