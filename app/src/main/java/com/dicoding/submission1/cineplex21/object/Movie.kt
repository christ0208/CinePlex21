package com.dicoding.submission1.cineplex21.`object`

import android.os.Parcel
import android.os.Parcelable

data class Movie (val id: Int, val image: Int, val name: String, val rating: Float, val yearPublished: Int, val duration: Int, val synopsis: String): Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readFloat(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest!!.writeInt(this.id)
        dest!!.writeInt(this.image)
        dest!!.writeString(this.name)
        dest!!.writeFloat(this.rating)
        dest!!.writeInt(this.yearPublished)
        dest!!.writeInt(this.duration)
        dest!!.writeString(this.synopsis)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }

}