package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmQybzwh;
import cn.ibizlab.ehr.webapi.dto.OrmQybzwhDTO;
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
public class OrmQybzwhMappingImpl implements OrmQybzwhMapping {

    @Override
    public OrmQybzwh toDomain(OrmQybzwhDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmQybzwh ormQybzwh = new OrmQybzwh();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormQybzwh.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormQybzwh.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            ormQybzwh.setXh( dto.getXh() );
        }
        if ( dto.getMs() != null ) {
            ormQybzwh.setMs( dto.getMs() );
        }
        if ( dto.getOrmqybzwhname() != null ) {
            ormQybzwh.setOrmqybzwhname( dto.getOrmqybzwhname() );
        }
        if ( dto.getOrmorgid() != null ) {
            ormQybzwh.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormQybzwh.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmqybzwhid() != null ) {
            ormQybzwh.setOrmqybzwhid( dto.getOrmqybzwhid() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormQybzwh.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormQybzwh.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormQybzwh.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            ormQybzwh.setOrmorgname( dto.getOrmorgname() );
        }

        return ormQybzwh;
    }

    @Override
    public OrmQybzwhDTO toDto(OrmQybzwh entity) {
        if ( entity == null ) {
            return null;
        }

        OrmQybzwhDTO ormQybzwhDTO = new OrmQybzwhDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormQybzwhDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormQybzwhDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            ormQybzwhDTO.setXh( entity.getXh() );
        }
        if ( entity.getMs() != null ) {
            ormQybzwhDTO.setMs( entity.getMs() );
        }
        if ( entity.getOrmqybzwhname() != null ) {
            ormQybzwhDTO.setOrmqybzwhname( entity.getOrmqybzwhname() );
        }
        if ( entity.getOrmorgid() != null ) {
            ormQybzwhDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormQybzwhDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmqybzwhid() != null ) {
            ormQybzwhDTO.setOrmqybzwhid( entity.getOrmqybzwhid() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormQybzwhDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormQybzwhDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormQybzwhDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            ormQybzwhDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return ormQybzwhDTO;
    }

    @Override
    public List<OrmQybzwh> toDomain(List<OrmQybzwhDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmQybzwh> list = new ArrayList<OrmQybzwh>( dtoList.size() );
        for ( OrmQybzwhDTO ormQybzwhDTO : dtoList ) {
            list.add( toDomain( ormQybzwhDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmQybzwhDTO> toDto(List<OrmQybzwh> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmQybzwhDTO> list = new ArrayList<OrmQybzwhDTO>( entityList.size() );
        for ( OrmQybzwh ormQybzwh : entityList ) {
            list.add( toDto( ormQybzwh ) );
        }

        return list;
    }
}
