package com.d121211096.music_track.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Article(
    @SerialName("artist")
    val artist: String?,
    @SerialName("artist_id")
    val artist_id: Int?,
    @SerialName("album")
    val album: String?,
    @SerialName("album_ids")
    val album_ids: String?,
    @SerialName("album_year")
    val album_year: String?,
    @SerialName("name")
    val name: String?,
    @SerialName("lyrics")
    val lyrics: String?,
    @SerialName("search_str")
    val search_str: String?,
    @SerialName("album_art")
    val album_art: String?,
    @SerialName("popularity")
    val popularity: Int?,
    @SerialName("singalong")
    val singalong: String?,
    @SerialName("meta")
    val meta: String?,
    @SerialName("id")
    val id: String?,
    @SerialName("search_score")
    val search_score: Float?,
    @SerialName("url")
    val url: String?
) : Parcelable

//{
//  "total": 10000,
//  "took": 6,
//  "data": [
//    {
//      "artist": "Blackstreet",
//      "artist_id": 11725,
//      "album": "Another Level",
//      "album_ids": "36778",
//      "album_year": "1996",
//      "name": "No Diggity",
//      "lyrics": "Yeah\nYou know what\nI like the playettes\nNo diggity, no doubt\nPlay on playette, play on playette\nYo Dre, drop the verse\n\nIt's going down, fade to blackstreet\nThe homies got rb, collab' creations\nBump like acne, no doubt\nI put it down, never slouch\nAs long as my credit can vouch\nA dog couldn't catch me ass out\nTell me who can stop when dre makin' moves\nAttracting honeys like a magnet\nGiving 'em eargasms with my mellow accent\nStill moving this flavor\nWith the homies blackstreet and teddy\nThe original rump shakers\n\nShorty get down, good lord\nBaby got 'em up open all over town\nStrictly biz, she don't play around\nCover much ground, got game by the pound\nGetting paid is her forte\nEach and every day, true player way\nI can't get her out of my mind\nI think about the girl all the time\nEast side to the west side\nPushin' phat rides, it's no surprise\nShe got tricks in the stash\nStacking up the cash\nFast when it comes to the gas\nBy no means average\nShe's on when she's got to have it\nBaby, you're a perfect ten, I wanna get in\nCan I get down, so I can win\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nShe's got class and style\nStreet knowledge by the pound\nBaby never act wild, very low key on the profile\nCatchin' feelings is a no\nLet me tell you how it goes\nCurve's the words, spins the verbs\nLovers it curves so freak what you heard\nRollin' with the phatness\nYou don't even know what the half is\nYou gotta pay to play\nJust for shorty, bang-bang, to look your way\nI like the way you work it\nTrumped tight all day, every day\nYou're blowing my mind, maybe in time\nBaby, I can get you in my ride\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nHey oh, hey oh, hey oh, hey oh (hey yo that girl looks good)\nHey oh, hey oh, hey oh, hey oh (play on, play on, play on)\nHey oh, hey oh, hey oh, hey oh (you're my kind of girl)\nHey oh, hey oh, hey oh, hey oh (hey yay oh)\n\n'Cause that's my peeps and we row g\nFlyin' first class from new york city to blackstreet\nWhat you know about me, not a motherfuckin' thing\nCartier wooded frames sported by my shortie\nAs for me, icy gleaming pinky diamond ring\nWe be's the baddest clique up on the scene\nAin't you getting bored with these fake ass broads\nI shows and proves, no doubt, I be taking you, so\nPlease excuse, if I come across rude\nThat's just me and that's how the playettes got to be\nStay kickin' game with a capital G\nAxe the peoples on my block, I'm as real as can be\nWord is bond, faking jacks never been my flavor\nSo, teddy, pass the word to your nigga chauncey\nI be sitting in car, let's say around three thirty\nQueen pen and blackstreet, it's no diggity\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nI like the way you work it\nNo diggity, I got to bag it up, bag it up\n\nI like the way you work it\nNo diggity, I got to bag it up\n\nYeah, Come on\nJackie in full effect\nLisa in full effect\nNicky in full effect\nTomeka in full effect\nLadies in full effect\nAin't nothing goin' on but the rent\nYeah play on playette, play on playette\nPlay on play on, play on play on\n'Cause I like it\nNo diggity, no doubt, yeah\nBlackstreet productions\nWe out, we out right\nWe out, we out",
//      "search_str": "Blackstreet No Diggity",
//      "album_art": "https://api.storage.ksoft.si/album/36778/1991438-4822.jpg",
//      "popularity": 387354,
//      "singalong": [
//        {
//          "lrc_timestamp": "[00:00.00]",
//          "milliseconds": "0",
//          "duration": "1660",
//          "line": "Yeah"
//        },
//        {
//          "lrc_timestamp": "[00:01.66]",
//          "milliseconds": "1660",
//          "duration": "2070",
//          "line": "You know what"
//        },
//        {
//          "lrc_timestamp": "[00:03.73]",
//          "milliseconds": "3730",
//          "duration": "3130",
//          "line": "I like the playettes"
//        },
//        {
//          "lrc_timestamp": "[00:06.86]",
//          "milliseconds": "6860",
//          "duration": "2770",
//          "line": "No diggity, no doubt"
//        },
//        {
//          "lrc_timestamp": "[00:09.63]",
//          "milliseconds": "9630",
//          "duration": "5830",
//          "line": "Play on playette, play on playette"
//        },
//        {
//          "lrc_timestamp": "[00:15.46]",
//          "milliseconds": "15460",
//          "duration": "5730",
//          "line": "Yo Dre, drop the verse"
//        },
//        {
//          "line": ""
//        },
//        {...}
//      ],
//      "meta": {
//        "spotify": {
//          "artists": [
//            "2P3cjUru4H3fhSXXNxE9kA",
//            "6DPYiyq5kWVQS4RGwxzPC7",
//            "0VbIlorLz3I5SEtIsc5vAr"
//          ],
//          "track": "6MdqqkQ8sSC0WB4i8PyRuQ",
//          "album": "2zGZLQiFl9UubtrVmtIkbi"
//        },
//        "deezer": {
//          "artists": [
//            "1861",
//            "763",
//            "450477"
//          ],
//          "track": "916496",
//          "album": "103254"
//        },
//        "artists": [
//          {
//            "name": "Dr. Dre",
//            "is_primary": false,
//            "id": 25053
//          },
//          {
//            "name": "Blackstreet",
//            "is_primary": true,
//            "id": 11725
//          }
//        ],
//        "other": {
//          "gain": -12,
//          "bpm": 88.7
//        }
//      },
//      "id": "1991438",
//      "search_score": 30.034847,
//      "url": "https://lyrics.ksoft.si/song/1991438/Blackstreet-No-Diggity"
//    }
//  ]
//}