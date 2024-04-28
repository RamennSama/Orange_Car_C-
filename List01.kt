
fun main(){
    val nums : List<Int> = listOf(1, 2, 3, 10, 4, 6, 5, 9, 8, 7) // ko cần List<Int> cũng được

    val findNum = nums.contains(3) // Kiểm tra xem List có chứa một phần tử cụ thể không
    val sum = nums.sum() // tính tổng
    val numSort = nums.sorted() // sắp xếp list
//  val name : MutableList<String> = mutableListOf("Ha", "Long", "Giau", "Qui", "Son", "Khoa") // ko cần MutableLis<String> cũng được
    val name = mutableListOf("Ha", "Long", "Giau", "Qui", "Son", "Khoa")
    name.add("Thang")
    name.remove("Son")
    // for(x in nums){
    //     print("$x ")
    // }
    println(nums[2]) // truy cập phần tử
    println(nums.count())
    println(nums.indexOf(5))
    println(nums.first())
    println(nums.last())
    println("List[0] : ${nums[0]}")
    println("List[0] : ${nums.get(0)}")
    println(nums)
    println(name)
    println(findNum)
    println(sum)
    println(numSort) // giong toString trong java
    println(10 in nums)
    println("Thang" in name)
    val resultList : List<Int> = nums
    println(resultList[0]);
}

// val nums : List<Int> = listOf(1, 2, 3, 10, 4, 6, 5, 9, 8, 7) // ko cần List<Int> cũng được
// val nums = listOf(1, 2, 3, 10, 4, 6, 5, 9, 8, 7) // ko cần List<Int> cũng được
// Trong Kotlin, List được coi là một cấu trúc dữ liệu không thay đổi (immutable), điều này có nghĩa là bạn không thể thay đổi nó sau 
// khi đã khởi tạo. Để thêm phần tử vào một List, bạn cần sử dụng một cấu trúc dữ liệu có thể thay đổi như MutableList.
// val name : MutableList<String> = mutableListOf("Ha", "Long", "Giau", "Qui", "Son", "Khoa") // ko cần MutableLis<String> cũng được
// val name = mutableListOf("Ha", "Long", "Giau", "Qui", "Son", "Khoa")


// --- mutableListOf ---
// nums.add() them vao ptu chi dung cho 
// name.remove("Son") Xoa ptu chi dung cho 

// --- Ca 2 ---
// println("List[0] : ${nums[0]}"), ("List[0] : ${nums.get(0)}") : truy cập ptu đẹp nhưng dài, hãy dùng cách thông thường
// val findNum = nums.contains(3) // Kiểm tra xem List có chứa một phần tử cụ thể không
// val sum = nums.sum() // tính tổng
// val numSort = nums.sorted() // sắp xếp list
// println(nums.first()) // ptu dau
// println(nums.last())  // ptu cuoi
// println(nums.indexOf) :Hàm indexOf()trả về chỉ mục (vị trí),
// lần xuất hiện đầu tiên của một văn bản được chỉ định trong một chuỗi (bao gồm cả khoảng trắng):
// println(nums.count()) : độ dài của list
// println(10 in nums) : kiểm tra có trong list ko
// gán list cho list khác cùng kiểu dữ liệu : val resultList : List<Int> = nums
// => sau khi xóa hoặc thêm, để bảo mật list đó, nên dùng 1 list khác gán vào nó

// 3 kieu khai bao list :
// val nums : List<Int> = listOf(1, 2, 3, 10, 4, 6, 5, 9, 8, 7)
// val nums = listOf<Int> (1, 2, 3, 10, 4, 6, 5, 9, 8, 7)
// val nums = listOf(1, 2, 3, 10, 4, 6, 5, 9, 8, 7)
