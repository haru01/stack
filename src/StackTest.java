
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class StackTest {

    @Nested
    class capacity {
        @DisplayName("スタックの容量はデフォルト10であること")
        @Test
        public void return10WhenDefaultNew() throws Exception {
            Stack stack = new Stack();
            assertEquals(10, stack.capacity());
        }
        // スタックの容量を初期化時に指定できること (例：capacityを2に指定した場合)
    }

    @Nested
    class size {
        // スタックのサイズは0であること、初期化時の場合
        // スタックのサイズが増えること、pushした場合 (例：push size1, push size2)
        // スタックのサイズが減ること、popした場合 (例：push push pop size1 pop size0)
    }

    @Nested
    class push {
        // 初期化直後でpush前の事後状態(toStringを利用)を確認
        // １回push後の事後状態(toStringを利用)を確認
        // 複数回push後の事後状態(toStringを利用)を確認
        // OverflowExceptionが投げられること,スタックが一杯の場合
    }

    @Nested
    class pop {
        // push&push&&popの事後状態(toString)を確認
        // pushした値が上に積まれてpopで取得できること（例：push(10) push(20) pop=>20 pop=>10）
        // EmptyExceptionが投げられること、スタックが空の場合
    }
    // テスト実行結果のレポートが読みやすいか確認すること
}
