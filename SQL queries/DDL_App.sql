create database KeinasthaFarma;
GO
use KeinasthaFarma;
GO


create table karyawan
(
    id_karyawan		VARCHAR(10),
    nama			VARCHAR(255),
    tanggal_lahir	DATE,
    asal_kota		VARCHAR(255),
    gender			VARCHAR(10),
    department		VARCHAR(255),
    gaji			DECIMAL(10,2),
	password		VARCHAR(255),
    primary key (id_karyawan)
);

create table uji_klinis
(
    batch_number				VARCHAR(8),
    persentase_protein			DECIMAL(5,2),
    persentase_kadar_air		DECIMAL(5,2),
    persentase_lemak			DECIMAL(5,2),
    kandungan_besi_per_kg		DECIMAL(8,3),
    kandungan_kalsium_per_kg	DECIMAL(8,3),
    kandungan_arsen_per_kg		DECIMAL(8,3),
    kandungan_kadmium_per_kg	DECIMAL(8,3),
    kandungan_timbal_per_kg		DECIMAL(8,3),
    kandungan_merkuri_per_kg	DECIMAL(8,3),
    kandungan_ecoli_per_g		DECIMAL(8,3),
    kandungan_salmolella_ssp_per_25g DECIMAL(8,3),
    primary key (batch_number)
);

create table bahan_baku_masuk
(
    id_transaksi	VARCHAR(8),
	material		VARCHAR(255),
    material_per_kg	FLOAT,
    acquired_date	DATE,
    seller			VARCHAR(255),
    total_weight	FLOAT,
    total_price		FLOAT,
    primary key (id_transaction)
);

create table produk_keluar
(
    id_produk			VARCHAR(8),
    nama_produk			VARCHAR(255),
    batch_number		VARCHAR(8),
    jumlah_kirim		INT,
    tanggal_produksi	DATE,
    tanggal_kadaluwarsa	DATE,
    bahan_baku_utama	VARCHAR(255),
    harga_per_kg		DECIMAL(10,2),
    tanggal_dokumen_kontrak DATE,
    pembeli				VARCHAR(255),
    sisa_kontrak		INT,
    primary key (id_produk)
);

