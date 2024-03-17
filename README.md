## Transmission Control Protocol (TCP)

Transmission Control Protocol (TCP) adalah metode berbasis aliran (stream) pada komunikasi jaringan. Modul ini membahas TCP stream dan bagaimana implementasinya pada Java. Berbeda dengan UDP, TCP menjamin data terkirim dan berurutan, menyediakan aliran komunikasi byte antara client dan server yang mendukung komunikasi dua arah. TCP menggunakan Internet Protocol (IP) untuk membuat koneksi antar mesin.

## Socket Pada TCP

Socket pada TCP dapat melakukan beberapa operasi lebih dibandingkan dengan UDP, yaitu mampu untuk:

- Membangun koneksi ke sebuah remote host
- Mengirim data ke remote host
- Menerima data dari remote host
- Menutup koneksi

Selain itu, terdapat pula tipe socket yang biasa digunakan sebagai server dengan kemampuan untuk mengikat (bind) nomor port tertentu. Socket ini mampu melakukan operasi berikut:

- Mengikat (bind) ke port local
- Menerima koneksi yang datang dari remote host
- Melepaskan (unbind) dari port local

Dua tipe socket ini masing-masing digunakan sebagai client atau sebagai server. Java mendukung implementasi dari TCP socket dengan adanya dua kelas socket, yaitu: java.net.Socket dan java.net.ServerSocket. Kelas Socket digunakan untuk membuat software client yang berhubungan dengan layanan tertentu, sedangkan kelas ServerSocket digunakan untuk membuat software server yang mengikat ke port local dan menyediakan layanan tertentu. Socket ini berbeda dengan DatagramSocket yang bekerja pada UDP dengan adanya fungsi koneksi ke server dan fungsi menerima data dari client.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.
