import java.io.BufferedReader;
import java.io.InputStreamReader;
public class company {
	public static void main(String args[]) {
		String result = ""; // ��� ���ڿ�
		Employee emp = null; // Employee��ü�� ���۷��� ����
		Manager mng = null; // Manager��ü�� ���۷��� ����
		String empNo = null; // �����ȣ�� �Է¹޴� ����
		String name = null; // �̸��� �Է¹޴� ����
		String part = null; // �μ��� �Է¹޴� ����
		String position = null; // ��å�� �Է¹޴� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("��� �Է�(��)A1010 : ");
			empNo = in.readLine();
			System.out.print("�̸� �Է�(��)�ڹ��� :");
			name = in.readLine();
			System.out.print("�μ� �Է�(��)��ȹ :");
			part = in.readLine();
			System.out.print("��å �Է�(��)���-1, �븮-2, ����-3 :");
			position = in.readLine();
		} catch (Exception e) {
			System.out.println("�Է� ����");
		}
		// position�� ���� "1"�̸� ���, �׿��̸� ������
				if (position.equals("1")) { // ���
					// EmployeeŬ������ ��üemp�� ����
					emp = new Employee(empNo, name, part);
					result += emp.resultStr();
				} else { // ������
					// position�� ���� "2"�̸� �븮��, �׿��̸� �������� ��ġ
					position = (position.equals("2")) ? "�븮" : "����";
					// ManagerŬ������ ��ü mng�� ����
					mng = new Manager(empNo, name, part, position);
					//result += mng.resultStr() + mng.addStr();
					result += mng.addStr();
				}

				// ��� ���ڿ��� �ֿܼ� ���
				System.out.println(result);
			}
		}
