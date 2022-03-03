package edu.usfca.cs272;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A utility class for finding all text files in a directory using lambda
 * expressions and streams.
 *
 * @author CS 272 Software Development (University of San Francisco)
 * @version Spring 2022
 */
public class TextFileFinder {
	/**
	 * A lambda expression that returns true if the path is a file that ends in a
	 * .txt or .text extension (case-insensitive). Useful for
	 * {@link Files#walk(Path, FileVisitOption...)}.
	 *
	 * @see Files#isRegularFile(Path, java.nio.file.LinkOption...)
	 * @see Path#getFileName()
	 * @see Files#walk(Path, FileVisitOption...)
	 */
	// TODO Implement IS_TEXT using a lambda expression
	public static final Predicate<Path> IS_TEXT = null;

	/**
	 * Returns a stream of all paths within the starting path that match the
	 * provided filter. Follows any symbolic links encountered.
	 *
	 * @param start the initial path to start with
	 * @param keep function that determines whether to keep a path
	 * @return a stream of paths
	 * @throws IOException if an IO error occurs
	 *
	 * @see FileVisitOption#FOLLOW_LINKS
	 * @see Files#walk(Path, FileVisitOption...)
	 */
	public static Stream<Path> find(Path start, Predicate<Path> keep) throws IOException {
		// TODO Implement this method using streams
		throw new UnsupportedOperationException("Not yet implemented.");
	};

	/**
	 * Returns a stream of text files.
	 *
	 * @param start the initial path to start with
	 * @return a stream of text files
	 * @throws IOException if an IO error occurs
	 *
	 * @see #find(Path, Predicate)
	 * @see #IS_TEXT
	 */
	public static Stream<Path> find(Path start) throws IOException {
		// TODO Implement this method using find(Path, Predicate);
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	/**
	 * Returns a list of text files using streams.
	 *
	 * @param start the initial path to search
	 * @return list of text files
	 * @throws IOException if an IO error occurs
	 *
	 * @see #find(Path)
	 * @see Stream#toList()
	 * @see Collectors#toList()
	 */
	public static List<Path> list(Path start) throws IOException {
		// TODO Implement this method using find(Path, Predicate);
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	/**
	 * Returns a list of text files using streams if the provided path is a valid
	 * directory, otherwise returns a list containing only the default path.
	 *
	 * @param start the starting path
	 * @param defaultPath the default to include if the starting path is not a
	 *   valid directory
	 * @return a list of paths
	 * @throws IOException if an IO error occurs
	 *
	 * @see #list(Path)
	 * @see List#of()
	 * @see Files#isDirectory(Path, java.nio.file.LinkOption...)
	 */
	public static List<Path> list(Path start, Path defaultPath) throws IOException {
		// TODO Implement this method using list(Path)
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	/**
	 * Demonstrates this class.
	 *
	 * @param args unused
	 * @throws IOException if unable to list path
	 */
	public static void main(String[] args) throws IOException {
		// TODO Modify and/or remove as necessary for debugging
		Path path = Path.of("src", "test", "resources", "simple");
		System.out.println(Files.isDirectory(path));
		System.out.println(list(path));
	}
}
