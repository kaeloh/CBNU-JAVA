class Manager extends Employee {
	private String position; // ��å

	// �Ű����� 4���� ���� ������
	public Manager(String empNo, String name, String part, String position) {
//		setEmpNo(empNo);
//		setName(name);
//		setPart(part);
		super(empNo, name, part);
		this.position = position;
	}

	// �����ڿ��� �߰��Ǵ� ������ ��� ���ڿ��� ����
	public String addStr() {
		String result = super.resultStr();
		result += "��å : " + position + "\n";
		return result;
	}
}

