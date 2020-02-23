package com.shakespace.kotlin

/**
 *  尾递归就是操作的最后一步是调用自身的递归
 *  function f(x) {
if (x === 1) return 1;
return f(x-1);
}

这不是尾递归：
function f(x) {
if (x === 1) return 1;
return 1 + f(x-1);
}

尾递归的判断标准是函数运行最后一步是否调用自身，而不是是否在函数的最后一行调用自身。
 */
data class ListNode(val value: Int, var next: ListNode?)

/**
 *  加入tailrec 会对尾递归优化
 *  如果本身不是尾递归，会有提示
 *  优化就是转换成迭代的形式，耗用内存稳定。
 *  不使用的话，可能有内存溢出的风险
 */
tailrec fun findListNode(head: ListNode?, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) return head
    return findListNode(head.next, value)
}

val string = """
    // 优化前
     public static final ListNode findListNode(@Nullable ListNode head, int value) {
      if (head != null) {
         return head.getValue() == value ? head : findListNode(head.getNext(), value);
      } else {
         return null;
      }
   }

   // 优化后
      public static final ListNode findListNode(@Nullable ListNode head, int value) {
      while(head != null) {
         if (head.getValue() == value) {
            return head;
         }
         head = head.getNext();
      }
      return null;
   }

    """
