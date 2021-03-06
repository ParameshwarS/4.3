import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class AssgnReducer extends Reducer<Text,IntWritable,Text,IntWritable>
{
IntWritable v= new IntWritable();
public void reduce (Text key,Iterable<IntWritable>values,Context context)
throws IOException,InterruptedException
{
	int i=0;
for(IntWritable value:values)
	{
		i=i+value.get();
	}
	v.set(i);
	context.write(key,v);
}
}