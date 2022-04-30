package com.luion.两数之和;



//普通二分法查找
public class Sum {
   public int search(int []nums,int target){
      int left = 0;
      int right = nums.length-1;
      while (left <= right){
//         int mid = left+(left+right)/2; 错误 无需再加left
         int mid = (left+right)/2;
         int num = nums[mid];
         if (target==num){
            return mid;
         }
         else if(target<num){
            right = mid -1;
         }
         else if(target>num){
            left = mid  +1;
         }
      }
         return -1;

   }

//   左侧二分法查找
   public int searchLeft(int nums[],int  target){

      int left = 0;
      int right = nums.length;
      while (left < right){
         int mid = (left+right)/2;
         int num = nums[mid];
         if (target == num){
            right = mid;
         }
         else if (target<num){
            right = mid; //因为区间是左闭右开的 【left，right）去掉mid 则【left,mid),[mid+1,right) 因为mid取不到
         }
         else if (target>num){
            left = mid +1;
         }

      }
      return left;

}}
