/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.initializr.web.project;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.util.StringUtils;

/**
 * The base settings of a project request. Only these can be bound by user's input.
 *
 * @author Stephane Nicoll
 */
@Schema(description = "A rqeuest for project generation")
public class ProjectRequest {

	@Schema(description = "The dependencies of the project. See /dependencies endpoint for more detail.",
			example = "web, data-jpa")
	private List<String> dependencies = new ArrayList<>();

	@Schema(description = "The name of the project", example = "demo")
	private String name;

	@Schema(description = "The type of the project", example = "maven-project")
	private String type;

	@Schema(description = "The description of the project", example = "Demo project for Spring Boot")
	private String description;

	@Schema(description = "The group ID of the project", example = "com.example")
	private String groupId;

	@Schema(description = "The artifact ID of the project", example = "demo")
	private String artifactId;

	@Schema(description = "The version of the project", example = "0.0.1-SNAPSHOT")
	private String version;

	@Schema(description = "The Spring Boot version of the project", example = "3.1.2")
	private String bootVersion;

	@Schema(description = "The packaging of the project", example = "jar", defaultValue = "jar")
	private String packaging;

	@Schema(description = "The name of the application", example = "demo")
	private String applicationName;

	@Schema(description = "The language of the project", example = "java", defaultValue = "java")
	private String language;

	@Schema(description = "The package name of the project", example = "com.example.demo")
	private String packageName;

	@Schema(description = "The Java version of the project", example = "17", defaultValue = "17")
	private String javaVersion;

	// The base directory to create in the archive - no baseDir by default
	@Schema(description = "The base directory to create in the archive", example = "")
	private String baseDir;

	public List<String> getDependencies() {
		return this.dependencies;
	}

	public void setDependencies(List<String> dependencies) {
		this.dependencies = dependencies;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return this.artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getBootVersion() {
		return this.bootVersion;
	}

	public void setBootVersion(String bootVersion) {
		this.bootVersion = bootVersion;
	}

	public String getPackaging() {
		return this.packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPackageName() {
		if (StringUtils.hasText(this.packageName)) {
			return this.packageName;
		}
		if (StringUtils.hasText(this.groupId) && StringUtils.hasText(this.artifactId)) {
			return getGroupId() + "." + getArtifactId();
		}
		return null;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getJavaVersion() {
		return this.javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getBaseDir() {
		return this.baseDir;
	}

	public void setBaseDir(String baseDir) {
		this.baseDir = baseDir;
	}

}
