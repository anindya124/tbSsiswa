package com.zubet.challengeroom1_anindya.room
import androidx.room.*

@Dao
interface tbsiswaDAO {

    @Insert
    fun addsiswa(nis : tbsiswa)

    @Update
     fun updatesiswa(nis : tbsiswa)

    @Delete
     fun deletesiswa(nis : tbsiswa)

    @Query("SELECT * FROM tbsiswa")
     fun gettbsiswa(nis : tbsiswa): List<tbsiswa>
}