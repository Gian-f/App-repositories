package br.com.dio.app.repositories.data.repository

import br.com.dio.app.repositories.data.services.GithubService
import kotlinx.coroutines.flow.flow

class RepoRepositoryImpl(private val service: GithubService) : RepoRepository{

    override suspend fun ListRepositories(user : String) = flow {
        val repoList = service.listRepositories(user)
       emit(repoList)
    }
}