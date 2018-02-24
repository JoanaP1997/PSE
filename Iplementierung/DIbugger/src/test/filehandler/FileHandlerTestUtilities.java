package test.filehandler;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SplittableRandom;

import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.filehandler.rdbf.RDBFAdditions;
import dibugger.filehandler.rdbf.RDBFBlock;
import dibugger.filehandler.rdbf.RDBFData;

public class FileHandlerTestUtilities {

	public static void sysoutBlock(RDBFBlock block, String tab) {
		System.out.println(tab + "-----" + block.getName() + "-----");
		for (RDBFData d : block.getList_data()) {
			System.out.println(tab + d.getName() + " " + d.getValue());
		}
		for (RDBFBlock b : block.getList_blocks()) {
			sysoutBlock(b, tab + "\t");
		}
	}

	public static void addRandomData(RDBFAdditions ad, SplittableRandom rand, int max) {
		for (int i = 0; i < rand.nextInt(2, 5); ++i) {
			String name = generateWord(rand);
			String value = generateValue(rand);
			ad.addData(new RDBFData(name, value));
		}
		for (int i = 0; i < (max > 0 ? rand.nextInt(1, 5) : 0); ++i) {
			String name = generateWord(rand);
			RDBFBlock b = new RDBFBlock(name);
			addRandomData(b, rand, max - 1);
			ad.addBlock(b);
		}
	}

	public static String generateWord(SplittableRandom rand) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < rand.nextInt(5, 9); ++i) {
			s.append((char) rand.nextInt('a', 'z'));
		}
		return s.toString();
	}

	public static String generateText(SplittableRandom rand) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < rand.nextInt(9, 34); ++i) {
			s.append(generateWord(rand)).append(" ");
			if (rand.nextBoolean()) {
				s.append("\n");
			}
		}
		return s.toString();
	}

	public static String generateNumber(SplittableRandom rand) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < rand.nextInt(2, 5); ++i) {
			s.append(rand.nextInt('0', '9'));
		}
		return s.toString();
	}

	public static String generateValue(SplittableRandom rand) {
		int type = rand.nextInt(6);
		if (type == RDBFData.DATA_STRING) {
			return "'" + generateWord(rand) + "'";
		} else if (type == RDBFData.DATA_INT) {
			return generateNumber(rand);
		} else if (type == RDBFData.DATA_LONG) {
			return generateNumber(rand) + "L";
		} else if (type == RDBFData.DATA_FLOAT) {
			return generateNumber(rand) + "." + generateNumber(rand) + "f";
		} else if (type == RDBFData.DATA_DOUBLE) {
			return generateNumber(rand) + "." + generateNumber(rand);
		} else if (type == RDBFData.DATA_BOOLEAN) {
			return "" + rand.nextBoolean();
		}
		return "";
	}

	public static ConfigurationFile generateConfig(File file) {
		ConfigurationFile f = new ConfigurationFile(file);
		SplittableRandom rand = new SplittableRandom();

		for (int i = 0; i < 2; ++i) {
			f.getList_programText().add(generateText(rand));
			f.getList_programNamespace().add(generateWord(rand));
			Map<String, String> input = new HashMap<String, String>();
			for (int j = 0; j < rand.nextInt(5); ++j) {
				String val = generateValue(rand);
				input.put(generateWord(rand), (val.startsWith("'") ? val.substring(1, val.length() - 1) : val));
			}
			f.getList_inputValues().add(input);
			f.getList_lastExecLine().add(0);
			f.getList_programStepSize().add(rand.nextInt(1, 5));
			List<String> insp = new ArrayList<String>();
			for (int j = 0; j < rand.nextInt(5); ++j) {
				insp.add(generateWord(rand));
			}
			f.getList_varInspector().add(insp);
			List<Integer> bp = new ArrayList<Integer>();
			for (int j = 0; j < rand.nextInt(5); ++j) {
				bp.add(Integer.parseInt(generateNumber(rand)));
			}
			f.getList_breakpoints().add(bp);
		}
		f.setNumPrograms(2);
		for (int i = 0; i < rand.nextInt(4); ++i) {
			List<Integer> lb = new ArrayList<Integer>();
			List<Integer> le = new ArrayList<Integer>();
			for (int j = 0; j < rand.nextInt(1, 3); ++j) {
				lb.add(rand.nextInt(8 * j, 8 + 8 * j));
				le.add(rand.nextInt(8 + 8 * j, 16 + 8 * j));
			}
			f.addWatchExpressions(generateWord(rand), lb, le);
		}
		for (int i = 0; i < rand.nextInt(4); ++i) {
			List<Integer> lb = new ArrayList<Integer>();
			List<Integer> le = new ArrayList<Integer>();
			for (int j = 0; j < rand.nextInt(1, 3); ++j) {
				lb.add(rand.nextInt(8 * j, 8 + 8 * j));
				le.add(rand.nextInt(8 + 8 * j, 16 + 8 * j));
			}
			f.addConditionalBreakpoint(generateWord(rand), lb, le);
		}

		return f;
	}
}
