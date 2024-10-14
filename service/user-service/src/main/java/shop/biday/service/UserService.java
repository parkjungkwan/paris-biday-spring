package shop.biday.service;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import shop.biday.model.document.UserDocument;
import shop.biday.model.domain.UserModel;


public interface UserService {
    Flux<UserDocument> findAll();

    Mono<UserDocument> findById(String id);

    Mono<UserDocument> save(UserModel userModel);

    Mono<Boolean> existsById(String id);

    Mono<Long> count();

    Mono<Void> deleteById(String id);
}
