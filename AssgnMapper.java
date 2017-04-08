import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 


public class AssignMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	Text k=new Text();
	IntWritable v=new IntWritable(1);
	
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {
		String[] s=value.toString().split("\t");
		k.set(data[1]); 
			context.write(k,v);
	
			
		}
}