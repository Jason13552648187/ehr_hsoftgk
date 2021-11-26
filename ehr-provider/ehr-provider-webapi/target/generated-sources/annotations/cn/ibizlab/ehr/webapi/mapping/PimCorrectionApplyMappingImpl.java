package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimCorrectionApply;
import cn.ibizlab.ehr.webapi.dto.PimCorrectionApplyDTO;
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
public class PimCorrectionApplyMappingImpl implements PimCorrectionApplyMapping {

    @Override
    public PimCorrectionApply toDomain(PimCorrectionApplyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimCorrectionApply pimCorrectionApply = new PimCorrectionApply();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimCorrectionApply.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimCorrectionApply.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimcorrectionapplyname() != null ) {
            pimCorrectionApply.setPimcorrectionapplyname( dto.getPimcorrectionapplyname() );
        }
        if ( dto.getPimbyygzzsqid() != null ) {
            pimCorrectionApply.setPimbyygzzsqid( dto.getPimbyygzzsqid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimCorrectionApply.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPimcorrectionapplyid() != null ) {
            pimCorrectionApply.setPimcorrectionapplyid( dto.getPimcorrectionapplyid() );
        }
        if ( dto.getEnable() != null ) {
            pimCorrectionApply.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            pimCorrectionApply.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimCorrectionApply.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimCorrectionApply.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            pimCorrectionApply.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getGw() != null ) {
            pimCorrectionApply.setGw( dto.getGw() );
        }
        if ( dto.getBm() != null ) {
            pimCorrectionApply.setBm( dto.getBm() );
        }
        if ( dto.getZz() != null ) {
            pimCorrectionApply.setZz( dto.getZz() );
        }
        if ( dto.getZj() != null ) {
            pimCorrectionApply.setZj( dto.getZj() );
        }
        if ( dto.getZw() != null ) {
            pimCorrectionApply.setZw( dto.getZw() );
        }
        if ( dto.getPimbyygzzsqname() != null ) {
            pimCorrectionApply.setPimbyygzzsqname( dto.getPimbyygzzsqname() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimCorrectionApply.setPimpersonname( dto.getPimpersonname() );
        }

        return pimCorrectionApply;
    }

    @Override
    public PimCorrectionApplyDTO toDto(PimCorrectionApply entity) {
        if ( entity == null ) {
            return null;
        }

        PimCorrectionApplyDTO pimCorrectionApplyDTO = new PimCorrectionApplyDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimCorrectionApplyDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimCorrectionApplyDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimcorrectionapplyname() != null ) {
            pimCorrectionApplyDTO.setPimcorrectionapplyname( entity.getPimcorrectionapplyname() );
        }
        if ( entity.getPimbyygzzsqid() != null ) {
            pimCorrectionApplyDTO.setPimbyygzzsqid( entity.getPimbyygzzsqid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimCorrectionApplyDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPimcorrectionapplyid() != null ) {
            pimCorrectionApplyDTO.setPimcorrectionapplyid( entity.getPimcorrectionapplyid() );
        }
        if ( entity.getEnable() != null ) {
            pimCorrectionApplyDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            pimCorrectionApplyDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimCorrectionApplyDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimCorrectionApplyDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            pimCorrectionApplyDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getGw() != null ) {
            pimCorrectionApplyDTO.setGw( entity.getGw() );
        }
        if ( entity.getBm() != null ) {
            pimCorrectionApplyDTO.setBm( entity.getBm() );
        }
        if ( entity.getZz() != null ) {
            pimCorrectionApplyDTO.setZz( entity.getZz() );
        }
        if ( entity.getZj() != null ) {
            pimCorrectionApplyDTO.setZj( entity.getZj() );
        }
        if ( entity.getZw() != null ) {
            pimCorrectionApplyDTO.setZw( entity.getZw() );
        }
        if ( entity.getPimbyygzzsqname() != null ) {
            pimCorrectionApplyDTO.setPimbyygzzsqname( entity.getPimbyygzzsqname() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimCorrectionApplyDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pimCorrectionApplyDTO;
    }

    @Override
    public List<PimCorrectionApply> toDomain(List<PimCorrectionApplyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimCorrectionApply> list = new ArrayList<PimCorrectionApply>( dtoList.size() );
        for ( PimCorrectionApplyDTO pimCorrectionApplyDTO : dtoList ) {
            list.add( toDomain( pimCorrectionApplyDTO ) );
        }

        return list;
    }

    @Override
    public List<PimCorrectionApplyDTO> toDto(List<PimCorrectionApply> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimCorrectionApplyDTO> list = new ArrayList<PimCorrectionApplyDTO>( entityList.size() );
        for ( PimCorrectionApply pimCorrectionApply : entityList ) {
            list.add( toDto( pimCorrectionApply ) );
        }

        return list;
    }
}
