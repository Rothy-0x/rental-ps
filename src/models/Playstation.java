package models;

import java.sql.SQLException;

import database.Database;

public class Playstation extends Database {

    // Constructor untuk Connect ke Database
    public Playstation() throws ClassNotFoundException, SQLException {
        super();
    }

    // Create
    public void insert(int idAdmin, String nama, String durasi, String alamat, String ps) throws SQLException {
        System.out.println(idAdmin);
        String sql = String.format("INSERT INTO tabel_peminjam (nama_peminjam, durasi_pinjam, alamat,jenis_ps, id_admin) VALUE ('%s', '%s', '%s', '%s', '%d')", nama, durasi,
                alamat, ps, idAdmin);
        this.setQuery(sql);
        this.execute();
    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM tabel_peminjam";
        this.setQuery(sql);
        this.take();
    }

    // Update
    public void update(int id, String nama, String durasi, String alamat, String ps) throws SQLException {
        String sql = String.format("UPDATE tabel_peminjam SET nama_peminjam = '%s', durasi_pinjam = '%s', alamat = '%s', jenis_ps = '%s' WHERE id_peminjam = %d",
                nama, durasi, alamat, ps, id);
        this.setQuery(sql);
        this.execute();
    }

    // Delete
    public boolean delete(int id) throws SQLException {
        String sql = String.format("DELETE FROM tabel_peminjam WHERE id_peminjam = %d", id);
        this.setQuery(sql);
        return this.executeUpdate() > 0;
    }

    // Validation untuk mencegah redudansi data
    public boolean check(String nama) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (this.value.getString("tabel_peminjam") == nama) {
                return false;
            }
        }
        return true;
    }

    // Print Data Peminjam
    public String[][] show() throws SQLException {
        String[][] data = new String[this.len()][6];
        getAll();
        this.take();
        int i = 0;
        while (this.value.next()) {
            data[i][0] = Integer.toString(this.value.getInt("id_peminjam"));
            data[i][1] = this.value.getString("nama_peminjam");
            data[i][2] = this.value.getString("durasi_pinjam");
            data[i][3] = this.value.getString("alamat");
            data[i][4] = this.value.getString("jenis_ps");
            data[i][5] = this.value.getString("id_admin");
            i++;
        }
        return data;
    }

    public int len() throws SQLException {
        getAll();
        this.take();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
