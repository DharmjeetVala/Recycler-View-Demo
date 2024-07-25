package com.example.recyclerview_demo

object Constant {

    private lateinit var dataList: ArrayList<Recycler_View_Model>

    fun getData():ArrayList<Recycler_View_Model>{

        dataList = ArrayList<Recycler_View_Model>()
        dataList.add(Recycler_View_Model(R.drawable.apple,"Apple Inc."))
        dataList.add(Recycler_View_Model(R.drawable.microsoft,"Microsoft Corporation"))
        dataList.add(Recycler_View_Model(R.drawable.nvidia,"Nvidia Corporation"))
        dataList.add(Recycler_View_Model(R.drawable.alphabet1,"Alphabet Inc."))
        dataList.add(Recycler_View_Model(R.drawable.amazon,"Amazon.com,Inc."))
        dataList.add(Recycler_View_Model(R.drawable.aramco,"Saudi Aramco"))
        dataList.add(Recycler_View_Model(R.drawable.meta,"Meta Platforms, Inc."))
        dataList.add(Recycler_View_Model(R.drawable.tesla,"Tesla, Inc."))
        dataList.add(Recycler_View_Model(R.drawable.visa,"Visa, Inc."))
        dataList.add(Recycler_View_Model(R.drawable.walmart,"Walmart"))
        dataList.add(Recycler_View_Model(R.drawable.cvshealth,"CVS Health"))
        dataList.add(Recycler_View_Model(R.drawable.ibm,"IBM"))
        dataList.add(Recycler_View_Model(R.drawable.intel,"Intel"))
        dataList.add(Recycler_View_Model(R.drawable.mastercard,"Mastercard, Inc."))
        dataList.add(Recycler_View_Model(R.drawable.jpmorgan,"JPMorgan Chase & Co."))
        return dataList
    }
}