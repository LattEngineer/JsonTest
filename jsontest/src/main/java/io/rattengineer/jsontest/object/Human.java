package io.rattengineer.jsontest.object;

/**
 * ��ü �����Դϴ�. �̰��� �����ϰ� Ȯ���ϱ� ���� ���������, �Ϻ��ϰ� ��������� �ʾҽ��ϴ�.
 * @author Junwon Kim
 *
 */
public class Human
{
	public int age;
	
	public double height;
	
	public double weight;
	
	public String name;
	
	public Human(int age, double height, double weight)
	{
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
