package io.rattengineer.jsontest;

import com.google.gson.Gson;

import io.rattengineer.jsontest.object.Human;

/**
 * 
 * Json ����ȭ �� ������ȭ�� ������ ������ �����Դϴ�.
 * Json ����ȭ �� ������ȭ�� �Ϸ��� ���� dependency�� Insert �Ͻñ� �ٶ��ϴ�.<br>
 * <pre>
 * &lt;dependencies>
&lt;!-- https://mvnrepository.com/artifact/com.google.code.gson/gson --&gt;
	&lt;dependency>
    	&lt;groupId>com.google.code.gson&lt;/groupId&gt;
    	&lt;artifactId>gson&lt;/artifactId&gt;
    	&lt;version>2.7&lt;/version&gt;
	&lt;/dependency&gt;
&lt;/dependencies&gt;
 * </pre>
 * @author Junwon Kim
 *
 */
public class JsonTest
{
	public static void main(String[] args)
	{
		// ����ȭ
		Gson gson = new Gson();
		Human human = new Human(12, 167.53D, 60.05D);
		human.setName("Gil Dong Hong");
		String result = gson.toJson(human);
		// ��°� : {"age":12,"height":167.53,"weight":60.05,"name":"Gil Dong Hong"}
		System.out.println(result);
		
		// ������ȭ
		Human human2 = gson.fromJson(result, Human.class);
		
		// ��°� : Gil Dong Hong
		System.out.println(human2.name);
	}
}
