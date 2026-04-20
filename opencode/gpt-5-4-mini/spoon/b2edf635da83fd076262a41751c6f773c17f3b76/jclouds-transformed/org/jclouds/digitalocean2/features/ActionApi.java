/* Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.jclouds.digitalocean2.features;
import java.beans.ConstructorProperties;
import java.io.Closeable;
import java.net.URI;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.jclouds.Fallbacks;
import org.jclouds.collect.IterableWithMarker;
import org.jclouds.collect.PagedIterable;
import org.jclouds.digitalocean2.DigitalOcean2Api;
import org.jclouds.digitalocean2.domain.Action;
import org.jclouds.digitalocean2.domain.internal.PaginatedCollection;
import org.jclouds.digitalocean2.domain.internal.PaginatedCollection.Links;
import org.jclouds.digitalocean2.domain.internal.PaginatedCollection.Meta;
import org.jclouds.digitalocean2.domain.options.ListOptions;
import org.jclouds.digitalocean2.functions.BaseToPagedIterable;
import org.jclouds.http.functions.ParseJson;
import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.Json;
import org.jclouds.oauth.v2.filters.OAuthFilter;
import org.jclouds.rest.annotations.Fallback;
import org.jclouds.rest.annotations.RequestFilters;
import org.jclouds.rest.annotations.ResponseParser;
import org.jclouds.rest.annotations.SelectJson;
import org.jclouds.rest.annotations.Transform;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.inject.TypeLiteral;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
/**
 * Provides access to Actions via the REST API.
 *
 * @see <a href="https://developers.digitalocean.com/v2/#actions"/>
 * @see ActionApi
 */
@Path("/actions")
@RequestFilters(OAuthFilter.class)
@Consumes(MediaType.APPLICATION_JSON)
public interface ActionApi extends Closeable {
    @Named("action:list")
    @GET
    @ResponseParser(ActionApi.ParseActions.class)
    @Transform(ActionApi.ParseActions.ToPagedIterable.class)
    @Fallback(Fallbacks.EmptyPagedIterableOnNotFoundOr404.class)
    PagedIterable<Action> list();

    @Named("action:list")
    @GET
    @ResponseParser(ActionApi.ParseActions.class)
    @Fallback(Fallbacks.EmptyIterableWithMarkerOnNotFoundOr404.class)
    IterableWithMarker<Action> list(ListOptions options);

    static final class ParseActions extends ParseJson<ParseActions.Actions> {
        @Inject
        ParseActions(Json json) {
            super(json, TypeLiteral.get(ActionApi.ParseActions.Actions.class));
        }

        private static class Actions extends PaginatedCollection<Action> {
            @ConstructorProperties({ "actions", "meta", "links" })
            public Actions(List<Action> items, Meta meta, Links links) {
                super(items, meta, links);
            }
        }

        private static class ToPagedIterable extends BaseToPagedIterable<Action, ListOptions> {
            @Inject
            ToPagedIterable(DigitalOcean2Api api, Function<URI, ListOptions> linkToOptions) {
                super(api, linkToOptions);
            }

            @Override
            protected IterableWithMarker<Action> fetchPageUsingOptions(ListOptions options, Optional<Object> arg0) {
                return api.actionApi().list(options);
            }
        }
    }

    @Named("action:get")
    @GET
    @SelectJson("action")
    @Path("/{id}")
    @Fallback(Fallbacks.NullOnNotFoundOr404.class)
    @Nullable
    Action get(@PathParam("id")
    int id);
}
