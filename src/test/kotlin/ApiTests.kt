import org.junit.Test
import kotlin.test.assertEquals

class ApiTests{

    @Test
    fun test3筆一組_取cost總和_預期回傳_6_15_24_21(){
        val fieldName = "cost"
        val groupByCount = 3
        val target = Api<TestData>(getInitTestData())

        val expected = intArrayOf(6, 15, 24, 11)

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)

        assertEquals(expected, actual)
    }

    @Test
    fun test4筆一組_取revenue總和_預期回傳_50_66_60(){
        val fieldName = "revenue"
        val groupByCount = 4
        val target = Api<TestData>(getInitTestData())

        val expected = intArrayOf(50, 66, 60)

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)

        assertEquals(expected, actual)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testCount輸入0_預期會拋_IllegalArgumentException(){
        val fieldName = "revenue"
        val groupByCount = 0
        val target = Api<TestData>(getInitTestData())

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testCount輸入負數_預期會拋_IllegalArgumentException(){
        val fieldName = "revenue"
        val groupByCount = -1
        val target = Api<TestData>(getInitTestData())

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testFieldName若不存在_預期會拋_IllegalArgumentException(){
        val fieldName = "hello"
        val groupByCount = 2
        val target = Api<TestData>(getInitTestData())

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)
    }

    fun getInitTestData(): ArrayList<TestData>{
        val testDataList = arrayListOf<TestData>()
        testDataList.add(TestData(1, 1, 11, 21))
        testDataList.add(TestData(2, 2, 12, 22))
        testDataList.add(TestData(3, 3, 13, 23))
        testDataList.add(TestData(4, 4, 14, 24))
        testDataList.add(TestData(5, 5, 15, 25))
        testDataList.add(TestData(6, 6, 16, 26))
        testDataList.add(TestData(7, 7, 17, 27))
        testDataList.add(TestData(8, 8, 18, 28))
        testDataList.add(TestData(9, 9, 19, 29))
        testDataList.add(TestData(10, 10, 20, 30))
        testDataList.add(TestData(11, 11, 21, 31))
        return testDataList
    }

    //來源可以是「任何型別的集合」
    data class TestData(val id: Any?, val cost: Any?, val revenue: Any?, val sellPrice: Any)

}