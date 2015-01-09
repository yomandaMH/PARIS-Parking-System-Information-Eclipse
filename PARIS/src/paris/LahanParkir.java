package paris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Vector;

public class LahanParkir {
	private String IdLahan;
	private int Kapasitas;
	private Vector<motor> dtMotor;
	
	public LahanParkir(String IdLahan, int Kapasitas) {
		super();
		dtMotor = new Vector<motor>(getKapasitas());
		this.IdLahan = IdLahan;
		this.Kapasitas = Kapasitas;
	}

	private void add(motor motor) {
		dtMotor.add(motor);
	}

	public String getIdLahan() {
		return IdLahan;
	}


	public void setIdLahan(String IdLahan) {
		this.IdLahan = IdLahan;
	}


	public int getKapasitas() {
		return Kapasitas;
	}


	public void setKapasitas(int Kapasitas) {
		this.Kapasitas = Kapasitas;
	}

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LahanParkir MTR = new LahanParkir("MOTOR", 200);
		do {
		System.out.println("menu utama : ");
		System.out.println("1. Masukkan NOPOL Kendaraan.");
		System.out.println("2. Tampilkan NOPOL Kendaraan.");
		System.out.println("3. Keluar Dari Program.");
		int pil;
		System.out.print("Masukkan Pilihan Anda : ");
		pil = Integer.parseInt(br.readLine());
		switch (pil)
		{
		case 1 : 
			{
				System.out.println("Berapa Data yang akan dimasukkan : ");
				int jumlah = Integer.parseInt(br.readLine());
				for (int x = 0; x < jumlah; x++)
				{
					System.out.println("Data Ke : " + (x+1));
					System.out.print("Masukkan NOPOL Kendaraan : ");
					String nopol = br.readLine();
					String tanggal = new Date().toString();
					MTR.add(new motor(nopol,tanggal));
				}
			}
		break;
		case 2 :
			{
				MTR.cetakDaftarMhs();
			}
		break;
		case 3 :
			{
				System.out.println("--------------------------------------------------------");
				System.out.println("=====   Trimakasih Telah Menggunakan Program Ini   =====");
				System.out.println("===== Copyright 2014 <Panji Pratama> IBIS Surabaya =====");
				System.out.println("--------------------------------------------------------");
				System.exit(0);
			}
		break;
		}
	}while (true);
		
	}
	
	public void cetak ()
	{
		System.out.println("Kode Lahan " + IdLahan);
		System.out.println("Kapasitas "+ Kapasitas);
	}
	
	public void cetakDaftarMhs()
	{
		System.out.println("Daftar NOPOL yang ada di Lahan : "+IdLahan);
		for (motor motor:dtMotor)
			System.out.println(motor);
	}

}
