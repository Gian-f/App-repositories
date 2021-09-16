package br.com.dio.app.repositories.data.repository

import br.com.dio.app.repositories.core.RemoteException
import br.com.dio.app.repositories.data.services.GithubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GithubService) : RepoRepository{

    override suspend fun ListRepositories(user : String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch(ex: HttpException) {
            throw RemoteException(ex.message ?: "Usuário não encontrado")
        }

    }
}