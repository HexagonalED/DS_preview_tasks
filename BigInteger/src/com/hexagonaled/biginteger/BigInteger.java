package com.hexagonaled.biginteger;

import java.io.*; // �Է��� �ޱ� ���� �� ���̺귯���� �ʿ��ϴ�.

public class BigInteger {
	public static void main(String args[]) {
		// �Է��� �ޱ� ���� �۾��̴�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// quit�� ���� �� ���� �Է��� �޾ƾ� �ϹǷ�
		// while(true) ���� ����Ͽ� ��� �ݺ��Ѵ�.
		while (true) {
			try // try �� catch ���� ���� �߻��� �����Ѵ�.
			{
				String input = br.readLine(); // �� ���� �Է� �޾� input ���ڿ��� ����

				if (input.compareTo("quit") == 0) {
					// quit ��� �Է¹޾��� ��� �����Ѵ�.
					// �����Ϸ��� while ���� �������;� �ϹǷ� break�� ����Ѵ�.
					break;
				}

				// quit�� �ƴ϶�� ���� ����ؾ� �Ѵ�.
				calculate(input);
			} catch (Exception e) {
				// ���� try { } �ȿ��� ������ �߻��ߴٸ� �̰����� ���� �ȴ�.
				// �̷��� �����ν� �Է��� �̻��ϰ� ���� ��� �߻��ϴ� ������ �����Ѵ�.
				System.out.println("�Է��� �߸��Ǿ����ϴ�. ���� : " + e.toString());
			}
		}
	}

	// �� �Լ����� �Է¹��� input ���ڿ��� �̿��Ͽ� ����� �ǽ��Ѵ�.
	// ���� main �Լ��� �Ϻ��ϰ� ������ �� �� �Լ��� ������ �����Ӱ� �����غ���.
	private static void calculate(String input) {
		// �Ʒ� �ڵ�� �Է��� ���������� �޴��� �׽�Ʈ�ϴ� �κ��̴�.
		String num1,num2;

		// TODO : Main �Լ��� �����ߴٸ� �Ʒ� ������ �����ϰ� �����ض�.
		// System.out.println("<< calculate �Լ����� " + input + "�� ����� �����Դϴ� >>");
		int i = 0;
		while (true) {
			if (!('0' <= input.charAt(i) && input.charAt(i) <= '9')) {

			} else {
				num1=getNum(input.substring(i));

			}

		}
	}
	
	private static String getNum(String input){
		int i;
		for(i=0;i<input.length();i++){
			if(!('0' <= input.charAt(i) && input.charAt(i) <= '9'))
				break;
		}
		return input.substring(0,i);
	}

}