package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmPost;
import cn.ibizlab.ehr.webapi.dto.OrmPostDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmPostMappingImpl implements OrmPostMapping {

    @Override
    public OrmPost toDomain(OrmPostDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmPost ormPost = new OrmPost();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormPost.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormPost.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLgnx() != null ) {
            ormPost.setLgnx( dto.getLgnx() );
        }
        if ( dto.getBxjlnx() != null ) {
            ormPost.setBxjlnx( dto.getBxjlnx() );
        }
        if ( dto.getIstemp() != null ) {
            ormPost.setIstemp( dto.getIstemp() );
        }
        if ( dto.getGwtype() != null ) {
            ormPost.setGwtype( dto.getGwtype() );
        }
        if ( dto.getQzlgnx() != null ) {
            ormPost.setQzlgnx( dto.getQzlgnx() );
        }
        if ( dto.getPostnature() != null ) {
            ormPost.setPostnature( dto.getPostnature() );
        }
        if ( dto.getIskeypostion() != null ) {
            ormPost.setIskeypostion( dto.getIskeypostion() );
        }
        if ( dto.getXh() != null ) {
            ormPost.setXh( dto.getXh() );
        }
        if ( dto.getNx() != null ) {
            ormPost.setNx( dto.getNx() );
        }
        if ( dto.getIsconfidential() != null ) {
            ormPost.setIsconfidential( dto.getIsconfidential() );
        }
        if ( dto.getOrmpostname() != null ) {
            ormPost.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getGwfl() != null ) {
            ormPost.setGwfl( dto.getGwfl() );
        }
        if ( dto.getStartstopsign() != null ) {
            ormPost.setStartstopsign( dto.getStartstopsign() );
        }
        if ( dto.getOrmorgid() != null ) {
            ormPost.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreateman() != null ) {
            ormPost.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormPost.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmpostid() != null ) {
            ormPost.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrgid() != null ) {
            ormPost.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormPost.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormPost.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            ormPost.setOrmorgname( dto.getOrmorgname() );
        }

        return ormPost;
    }

    @Override
    public OrmPostDTO toDto(OrmPost entity) {
        if ( entity == null ) {
            return null;
        }

        OrmPostDTO ormPostDTO = new OrmPostDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormPostDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormPostDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLgnx() != null ) {
            ormPostDTO.setLgnx( entity.getLgnx() );
        }
        if ( entity.getBxjlnx() != null ) {
            ormPostDTO.setBxjlnx( entity.getBxjlnx() );
        }
        if ( entity.getIstemp() != null ) {
            ormPostDTO.setIstemp( entity.getIstemp() );
        }
        if ( entity.getGwtype() != null ) {
            ormPostDTO.setGwtype( entity.getGwtype() );
        }
        if ( entity.getQzlgnx() != null ) {
            ormPostDTO.setQzlgnx( entity.getQzlgnx() );
        }
        if ( entity.getPostnature() != null ) {
            ormPostDTO.setPostnature( entity.getPostnature() );
        }
        if ( entity.getIskeypostion() != null ) {
            ormPostDTO.setIskeypostion( entity.getIskeypostion() );
        }
        if ( entity.getXh() != null ) {
            ormPostDTO.setXh( entity.getXh() );
        }
        if ( entity.getNx() != null ) {
            ormPostDTO.setNx( entity.getNx() );
        }
        if ( entity.getIsconfidential() != null ) {
            ormPostDTO.setIsconfidential( entity.getIsconfidential() );
        }
        if ( entity.getOrmpostname() != null ) {
            ormPostDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getGwfl() != null ) {
            ormPostDTO.setGwfl( entity.getGwfl() );
        }
        if ( entity.getStartstopsign() != null ) {
            ormPostDTO.setStartstopsign( entity.getStartstopsign() );
        }
        if ( entity.getOrmorgid() != null ) {
            ormPostDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreateman() != null ) {
            ormPostDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormPostDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmpostid() != null ) {
            ormPostDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrgid() != null ) {
            ormPostDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormPostDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormPostDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            ormPostDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return ormPostDTO;
    }

    @Override
    public List<OrmPost> toDomain(List<OrmPostDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmPost> list = new ArrayList<OrmPost>( dtoList.size() );
        for ( OrmPostDTO ormPostDTO : dtoList ) {
            list.add( toDomain( ormPostDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmPostDTO> toDto(List<OrmPost> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmPostDTO> list = new ArrayList<OrmPostDTO>( entityList.size() );
        for ( OrmPost ormPost : entityList ) {
            list.add( toDto( ormPost ) );
        }

        return list;
    }
}
