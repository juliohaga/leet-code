fun twoSum(nums: IntArray, target: Int) : IntArray{

        var twosum : MutableList<Int> = mutableListOf()

        for ((i, num) in nums.withIndex()){
            if (i != nums.lastIndex && (num + nums[i+1] == target)) {
                twosum.add(i)
                twosum.add(i+1)
            }
        }

        return twosum.toIntArray()

    }
