package io.rattengineer.jsontest.object;

/**
 * 객체 예시입니다. 이것은 간단하게 확인하기 위해 만들었으며, 완벽하게 만들어지지 않았습니다.
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
