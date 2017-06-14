import org.junit.Test
import kotlin.test.assertEquals

class ProductApiTests {

    @Test
    fun test3筆一組_取cost總和_預期回傳_6_15_24_21(){
        val fieldName = "cost"
        val groupByCount = 3
        val target = ProductApi<Product>(getInitProduct())

        val expected = intArrayOf(6, 15, 24, 21)

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)

        assertEquals(expected, actual)
    }

    @Test
    fun test4筆一組_取revenue總和_預期回傳_50_66_60(){
        val fieldName = "revenue"
        val groupByCount = 4
        val target = ProductApi<Product>(getInitProduct())

        val expected = intArrayOf(50, 66, 60)

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)

        assertEquals(expected, actual)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testCount輸入0_預期會拋_IllegalArgumentException(){
        val fieldName = "revenue"
        val groupByCount = 0
        val target = ProductApi<Product>(getInitProduct())

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testCount輸入負數_預期會拋_IllegalArgumentException(){
        val fieldName = "revenue"
        val groupByCount = -1
        val target = ProductApi<Product>(getInitProduct())

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testFieldName若不存在_預期會拋_IllegalArgumentException(){
        val fieldName = "hello"
        val groupByCount = 2
        val target = ProductApi<Product>(getInitProduct())

        val actual = target.sum(fieldName = fieldName, groupByCount = groupByCount)
    }

    fun getInitProduct(): ArrayList<Product>{
        return arrayListOf(
                Product {val id = 1; val cost = 1; val revenue = 11; val sellPrice = 21},
                Product {val id = 2; val cost = 2; val revenue = 12; val sellPrice = 22},
                Product {val id = 3; val cost = 3; val revenue = 13; val sellPrice = 23},
                Product {val id = 4; val cost = 4; val revenue = 14; val sellPrice = 24},
                Product {val id = 5; val cost = 5; val revenue = 15; val sellPrice = 25},
                Product {val id = 6; val cost = 6; val revenue = 16; val sellPrice = 26},
                Product {val id = 7; val cost = 7; val revenue = 17; val sellPrice = 27},
                Product {val id = 8; val cost = 8; val revenue = 18; val sellPrice = 28},
                Product {val id = 9; val cost = 9; val revenue = 19; val sellPrice = 29},
                Product {val id = 10; val cost = 10; val revenue = 20; val sellPrice = 30},
                Product {val id = 11; val cost = 11; val revenue = 21; val sellPrice = 31}
        )
    }

}