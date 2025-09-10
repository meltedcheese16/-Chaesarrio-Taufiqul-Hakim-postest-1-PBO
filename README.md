# -Chaesarrio-Taufiqul-Hakim-postest-1-PBO
Nama = Chaesarrio Taufiqul Hakim
NIM = 2409116096

## Deskripsi Singkat
Program ini adalah aplikasi CRUD sederhana berbasis Java yang digunakan untuk mencatat hasil panen sayur.
Dibuat untuk latihan dasar pemrograman menggunakan:

1) ArrayList untuk menyimpan data panen
2) Percabangan untuk memilih menu
3) Perulangan agar program berjalan terus sampai pengguna memilih keluar
4) Input dari pengguna menggunakan Scanner

## Fitur Program

Tambah Data Panen – memasukkan nama sayur, jumlah, tanggal panen, kualitas, dan lokasi lahan/petani.

1) Lihat Data Panen, menampilkan seluruh data yang tersimpan.
2) Update Data Panen, memperbarui data yang sudah ada.
3) Hapus Data Panen, menghapus data panen tertentu.
4) Keluar Program, menghentikan aplikasi.

## Alur Program

### Program dimulai, menampilkan menu utama:
<pre>1. Tambah Data  
2. Lihat Data  
3. Update Data  
4. Hapus Data  
5. Keluar </pre>

<img width="594" height="172" alt="image" src="https://github.com/user-attachments/assets/acefb3ca-7e88-4305-bafb-0de78cd96961" />

### Tambah Komoditas
jika memilih no 1 yakni Tambah Data Maka Program akan meminta input:

<pre>Nama sayur
Jumlah (kg)
Tanggal panen
Kualitas / Grade
Lokasi / Petani</pre>

Yang kemudian Data akan disimpan ke dalam ArrayList.

<img width="443" height="180" alt="image" src="https://github.com/user-attachments/assets/8318ab95-b027-4f7d-be91-531cb17b3159" />

### Lihat Daftar Komoditas
jika memilih no 2 yakni Lihat Data Maka Program akan menampilkan semua data yang ada di ArrayList.

Jika kosong, akan muncul pesan "Belum ada data."

<img width="1011" height="113" alt="image" src="https://github.com/user-attachments/assets/99f573a6-bbf7-465c-96bf-af3f30efe268" />

### Update Daftar Komoditas

<pre>1) Program menampilkan daftar data yang ada.
2) Pengguna memilih nomor data yang ingin diperbarui.
3) Program meminta input baru untuk mengganti data lama.</pre>

<img width="1059" height="287" alt="image" src="https://github.com/user-attachments/assets/17db927e-02c7-4423-b73f-cf164dc9fef8" />

### Hapus Daftar Komoditas

<pre>1) Program menampilkan daftar data yang ada.
2) Pengguna memilih nomor data yang ingin dihapus.
3) Data langsung dihapus dari ArrayList.</pre>

<img width="954" height="167" alt="image" src="https://github.com/user-attachments/assets/253daee1-2428-4a12-8cd6-2a62e9ad4bc9" />

### Keluar 

<pre>Program berhenti dan menampilkan pesan "Program selesai. Terima kasih!"</pre>

Perulangan berjalan sehingga menu akan ditampilkan lagi setelah setiap aksi,
kecuali jika pengguna memilih menu Keluar.
