package draw_by_for;

public class TestDraw {
	/**
	 * 5�� 4�� �����
	 * 
	 * ****		4	-1
	 * ***		3
	 * **		2
	 * *  �߾� 3 1	������ȯ +1
	 * **		2	
	 * ***		3
	 * ****		4
	 * @author qoddn987
	 */
	public static void main(String[] args) {
		
		filled();
	}
	
	private static void filled() {
		final int ROW_COUNT = 7, COL_COUNT = 4;
		final int CENTER_ROW = ROW_COUNT / 2;
		//���� ��ȯ 
		int direction = -1, colRepeat = COL_COUNT; 
				
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			for(int colIdx = 0; colIdx < colRepeat; colIdx++) {
				System.out.print('*');
			}
			System.out.println();
			if (rowIdx == CENTER_ROW) {
				direction *= -1;
			}
			colRepeat += direction;
		}
	}

}
