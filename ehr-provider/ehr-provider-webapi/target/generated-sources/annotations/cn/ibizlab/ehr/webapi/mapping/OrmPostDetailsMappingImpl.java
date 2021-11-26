package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmPostDetails;
import cn.ibizlab.ehr.webapi.dto.OrmPostDetailsDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmPostDetailsMappingImpl implements OrmPostDetailsMapping {

    @Override
    public OrmPostDetails toDomain(OrmPostDetailsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmPostDetails ormPostDetails = new OrmPostDetails();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormPostDetails.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormPostDetails.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrmpostdetailsname() != null ) {
            ormPostDetails.setOrmpostdetailsname( dto.getOrmpostdetailsname() );
        }
        if ( dto.getOrmpostid() != null ) {
            ormPostDetails.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmpostlibid() != null ) {
            ormPostDetails.setOrmpostlibid( dto.getOrmpostlibid() );
        }
        if ( dto.getCreateman() != null ) {
            ormPostDetails.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            ormPostDetails.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormPostDetails.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmpostdetailsid() != null ) {
            ormPostDetails.setOrmpostdetailsid( dto.getOrmpostdetailsid() );
        }
        if ( dto.getCreatedate() != null ) {
            ormPostDetails.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getGwflag() != null ) {
            ormPostDetails.setGwflag( dto.getGwflag() );
        }
        if ( dto.getSugexcyear() != null ) {
            ormPostDetails.setSugexcyear( dto.getSugexcyear() );
        }
        if ( dto.getGwtype() != null ) {
            ormPostDetails.setGwtype( dto.getGwtype() );
        }
        if ( dto.getPostnature() != null ) {
            ormPostDetails.setPostnature( dto.getPostnature() );
        }
        if ( dto.getOrmpostname() != null ) {
            ormPostDetails.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getMustexcyear() != null ) {
            ormPostDetails.setMustexcyear( dto.getMustexcyear() );
        }
        if ( dto.getOrmpostlibname() != null ) {
            ormPostDetails.setOrmpostlibname( dto.getOrmpostlibname() );
        }
        if ( dto.getIsconfidential() != null ) {
            ormPostDetails.setIsconfidential( dto.getIsconfidential() );
        }

        return ormPostDetails;
    }

    @Override
    public OrmPostDetailsDTO toDto(OrmPostDetails entity) {
        if ( entity == null ) {
            return null;
        }

        OrmPostDetailsDTO ormPostDetailsDTO = new OrmPostDetailsDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormPostDetailsDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormPostDetailsDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrmpostdetailsname() != null ) {
            ormPostDetailsDTO.setOrmpostdetailsname( entity.getOrmpostdetailsname() );
        }
        if ( entity.getOrmpostid() != null ) {
            ormPostDetailsDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmpostlibid() != null ) {
            ormPostDetailsDTO.setOrmpostlibid( entity.getOrmpostlibid() );
        }
        if ( entity.getCreateman() != null ) {
            ormPostDetailsDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            ormPostDetailsDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormPostDetailsDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmpostdetailsid() != null ) {
            ormPostDetailsDTO.setOrmpostdetailsid( entity.getOrmpostdetailsid() );
        }
        if ( entity.getCreatedate() != null ) {
            ormPostDetailsDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getGwflag() != null ) {
            ormPostDetailsDTO.setGwflag( entity.getGwflag() );
        }
        if ( entity.getSugexcyear() != null ) {
            ormPostDetailsDTO.setSugexcyear( entity.getSugexcyear() );
        }
        if ( entity.getGwtype() != null ) {
            ormPostDetailsDTO.setGwtype( entity.getGwtype() );
        }
        if ( entity.getPostnature() != null ) {
            ormPostDetailsDTO.setPostnature( entity.getPostnature() );
        }
        if ( entity.getOrmpostname() != null ) {
            ormPostDetailsDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getMustexcyear() != null ) {
            ormPostDetailsDTO.setMustexcyear( entity.getMustexcyear() );
        }
        if ( entity.getOrmpostlibname() != null ) {
            ormPostDetailsDTO.setOrmpostlibname( entity.getOrmpostlibname() );
        }
        if ( entity.getIsconfidential() != null ) {
            ormPostDetailsDTO.setIsconfidential( entity.getIsconfidential() );
        }

        return ormPostDetailsDTO;
    }

    @Override
    public List<OrmPostDetails> toDomain(List<OrmPostDetailsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmPostDetails> list = new ArrayList<OrmPostDetails>( dtoList.size() );
        for ( OrmPostDetailsDTO ormPostDetailsDTO : dtoList ) {
            list.add( toDomain( ormPostDetailsDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmPostDetailsDTO> toDto(List<OrmPostDetails> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmPostDetailsDTO> list = new ArrayList<OrmPostDetailsDTO>( entityList.size() );
        for ( OrmPostDetails ormPostDetails : entityList ) {
            list.add( toDto( ormPostDetails ) );
        }

        return list;
    }
}
