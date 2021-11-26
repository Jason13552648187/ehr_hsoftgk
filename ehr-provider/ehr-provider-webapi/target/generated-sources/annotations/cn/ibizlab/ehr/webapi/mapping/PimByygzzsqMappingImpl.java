package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimByygzzsq;
import cn.ibizlab.ehr.webapi.dto.PimByygzzsqDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimByygzzsqMappingImpl implements PimByygzzsqMapping {

    @Override
    public PimByygzzsq toDomain(PimByygzzsqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimByygzzsq pimByygzzsq = new PimByygzzsq();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimByygzzsq.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimByygzzsq.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getZzlx() != null ) {
            pimByygzzsq.setZzlx( dto.getZzlx() );
        }
        if ( dto.getIstemp() != null ) {
            pimByygzzsq.setIstemp( dto.getIstemp() );
        }
        if ( dto.getCzrq() != null ) {
            pimByygzzsq.setCzrq( dto.getCzrq() );
        }
        if ( dto.getBz() != null ) {
            pimByygzzsq.setBz( dto.getBz() );
        }
        if ( dto.getPimbyygzzsqname() != null ) {
            pimByygzzsq.setPimbyygzzsqname( dto.getPimbyygzzsqname() );
        }
        if ( dto.getSxrq() != null ) {
            pimByygzzsq.setSxrq( dto.getSxrq() );
        }
        if ( dto.getCzr() != null ) {
            pimByygzzsq.setCzr( dto.getCzr() );
        }
        if ( dto.getCreatedate() != null ) {
            pimByygzzsq.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimByygzzsq.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimByygzzsq.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimByygzzsq.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimbyygzzsqid() != null ) {
            pimByygzzsq.setPimbyygzzsqid( dto.getPimbyygzzsqid() );
        }

        return pimByygzzsq;
    }

    @Override
    public PimByygzzsqDTO toDto(PimByygzzsq entity) {
        if ( entity == null ) {
            return null;
        }

        PimByygzzsqDTO pimByygzzsqDTO = new PimByygzzsqDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimByygzzsqDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimByygzzsqDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getZzlx() != null ) {
            pimByygzzsqDTO.setZzlx( entity.getZzlx() );
        }
        if ( entity.getIstemp() != null ) {
            pimByygzzsqDTO.setIstemp( entity.getIstemp() );
        }
        if ( entity.getCzrq() != null ) {
            pimByygzzsqDTO.setCzrq( entity.getCzrq() );
        }
        if ( entity.getBz() != null ) {
            pimByygzzsqDTO.setBz( entity.getBz() );
        }
        if ( entity.getPimbyygzzsqname() != null ) {
            pimByygzzsqDTO.setPimbyygzzsqname( entity.getPimbyygzzsqname() );
        }
        if ( entity.getSxrq() != null ) {
            pimByygzzsqDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getCzr() != null ) {
            pimByygzzsqDTO.setCzr( entity.getCzr() );
        }
        if ( entity.getCreatedate() != null ) {
            pimByygzzsqDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimByygzzsqDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimByygzzsqDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimByygzzsqDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimbyygzzsqid() != null ) {
            pimByygzzsqDTO.setPimbyygzzsqid( entity.getPimbyygzzsqid() );
        }

        return pimByygzzsqDTO;
    }

    @Override
    public List<PimByygzzsq> toDomain(List<PimByygzzsqDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimByygzzsq> list = new ArrayList<PimByygzzsq>( dtoList.size() );
        for ( PimByygzzsqDTO pimByygzzsqDTO : dtoList ) {
            list.add( toDomain( pimByygzzsqDTO ) );
        }

        return list;
    }

    @Override
    public List<PimByygzzsqDTO> toDto(List<PimByygzzsq> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimByygzzsqDTO> list = new ArrayList<PimByygzzsqDTO>( entityList.size() );
        for ( PimByygzzsq pimByygzzsq : entityList ) {
            list.add( toDto( pimByygzzsq ) );
        }

        return list;
    }
}
