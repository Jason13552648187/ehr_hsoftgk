package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmQygl;
import cn.ibizlab.ehr.webapi.dto.OrmQyglDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmQyglMappingImpl implements OrmQyglMapping {

    @Override
    public OrmQygl toDomain(OrmQyglDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmQygl ormQygl = new OrmQygl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormQygl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormQygl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrmqyglname() != null ) {
            ormQygl.setOrmqyglname( dto.getOrmqyglname() );
        }
        if ( dto.getBzsm() != null ) {
            ormQygl.setBzsm( dto.getBzsm() );
        }
        if ( dto.getXh() != null ) {
            ormQygl.setXh( dto.getXh() );
        }
        if ( dto.getOrmorgid() != null ) {
            ormQygl.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormQygl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormQygl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmqyglid() != null ) {
            ormQygl.setOrmqyglid( dto.getOrmqyglid() );
        }
        if ( dto.getCreateman() != null ) {
            ormQygl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormQygl.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            ormQygl.setOrmorgname( dto.getOrmorgname() );
        }

        return ormQygl;
    }

    @Override
    public OrmQyglDTO toDto(OrmQygl entity) {
        if ( entity == null ) {
            return null;
        }

        OrmQyglDTO ormQyglDTO = new OrmQyglDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormQyglDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormQyglDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrmqyglname() != null ) {
            ormQyglDTO.setOrmqyglname( entity.getOrmqyglname() );
        }
        if ( entity.getBzsm() != null ) {
            ormQyglDTO.setBzsm( entity.getBzsm() );
        }
        if ( entity.getXh() != null ) {
            ormQyglDTO.setXh( entity.getXh() );
        }
        if ( entity.getOrmorgid() != null ) {
            ormQyglDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormQyglDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormQyglDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmqyglid() != null ) {
            ormQyglDTO.setOrmqyglid( entity.getOrmqyglid() );
        }
        if ( entity.getCreateman() != null ) {
            ormQyglDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormQyglDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            ormQyglDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return ormQyglDTO;
    }

    @Override
    public List<OrmQygl> toDomain(List<OrmQyglDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmQygl> list = new ArrayList<OrmQygl>( dtoList.size() );
        for ( OrmQyglDTO ormQyglDTO : dtoList ) {
            list.add( toDomain( ormQyglDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmQyglDTO> toDto(List<OrmQygl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmQyglDTO> list = new ArrayList<OrmQyglDTO>( entityList.size() );
        for ( OrmQygl ormQygl : entityList ) {
            list.add( toDto( ormQygl ) );
        }

        return list;
    }
}
