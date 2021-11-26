package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmProfileApproval;
import cn.ibizlab.ehr.webapi.dto.PcmProfileApprovalDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmProfileApprovalMappingImpl implements PcmProfileApprovalMapping {

    @Override
    public PcmProfileApproval toDomain(PcmProfileApprovalDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmProfileApproval pcmProfileApproval = new PcmProfileApproval();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmProfileApproval.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmProfileApproval.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFastate() != null ) {
            pcmProfileApproval.setFastate( dto.getFastate() );
        }
        if ( dto.getPassorreject() != null ) {
            pcmProfileApproval.setPassorreject( dto.getPassorreject() );
        }
        if ( dto.getApprover() != null ) {
            pcmProfileApproval.setApprover( dto.getApprover() );
        }
        if ( dto.getApprovaldate() != null ) {
            pcmProfileApproval.setApprovaldate( dto.getApprovaldate() );
        }
        if ( dto.getApprovalopinion() != null ) {
            pcmProfileApproval.setApprovalopinion( dto.getApprovalopinion() );
        }
        if ( dto.getYjyy() != null ) {
            pcmProfileApproval.setYjyy( dto.getYjyy() );
        }
        if ( dto.getApprovalstage() != null ) {
            pcmProfileApproval.setApprovalstage( dto.getApprovalstage() );
        }
        if ( dto.getPcmprofileapprovalname() != null ) {
            pcmProfileApproval.setPcmprofileapprovalname( dto.getPcmprofileapprovalname() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmProfileApproval.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getPimbyzzjlmxid() != null ) {
            pcmProfileApproval.setPimbyzzjlmxid( dto.getPimbyzzjlmxid() );
        }
        if ( dto.getPcmprofileapprovalid() != null ) {
            pcmProfileApproval.setPcmprofileapprovalid( dto.getPcmprofileapprovalid() );
        }
        if ( dto.getEnable() != null ) {
            pcmProfileApproval.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmProfileApproval.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmProfileApproval.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmProfileApproval.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmProfileApproval.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimbyzzjlmxname() != null ) {
            pcmProfileApproval.setPimbyzzjlmxname( dto.getPimbyzzjlmxname() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmProfileApproval.setPcmprofilename( dto.getPcmprofilename() );
        }

        return pcmProfileApproval;
    }

    @Override
    public PcmProfileApprovalDTO toDto(PcmProfileApproval entity) {
        if ( entity == null ) {
            return null;
        }

        PcmProfileApprovalDTO pcmProfileApprovalDTO = new PcmProfileApprovalDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmProfileApprovalDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmProfileApprovalDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFastate() != null ) {
            pcmProfileApprovalDTO.setFastate( entity.getFastate() );
        }
        if ( entity.getPassorreject() != null ) {
            pcmProfileApprovalDTO.setPassorreject( entity.getPassorreject() );
        }
        if ( entity.getApprover() != null ) {
            pcmProfileApprovalDTO.setApprover( entity.getApprover() );
        }
        if ( entity.getApprovaldate() != null ) {
            pcmProfileApprovalDTO.setApprovaldate( entity.getApprovaldate() );
        }
        if ( entity.getApprovalopinion() != null ) {
            pcmProfileApprovalDTO.setApprovalopinion( entity.getApprovalopinion() );
        }
        if ( entity.getYjyy() != null ) {
            pcmProfileApprovalDTO.setYjyy( entity.getYjyy() );
        }
        if ( entity.getApprovalstage() != null ) {
            pcmProfileApprovalDTO.setApprovalstage( entity.getApprovalstage() );
        }
        if ( entity.getPcmprofileapprovalname() != null ) {
            pcmProfileApprovalDTO.setPcmprofileapprovalname( entity.getPcmprofileapprovalname() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmProfileApprovalDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getPimbyzzjlmxid() != null ) {
            pcmProfileApprovalDTO.setPimbyzzjlmxid( entity.getPimbyzzjlmxid() );
        }
        if ( entity.getPcmprofileapprovalid() != null ) {
            pcmProfileApprovalDTO.setPcmprofileapprovalid( entity.getPcmprofileapprovalid() );
        }
        if ( entity.getEnable() != null ) {
            pcmProfileApprovalDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmProfileApprovalDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmProfileApprovalDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmProfileApprovalDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmProfileApprovalDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimbyzzjlmxname() != null ) {
            pcmProfileApprovalDTO.setPimbyzzjlmxname( entity.getPimbyzzjlmxname() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmProfileApprovalDTO.setPcmprofilename( entity.getPcmprofilename() );
        }

        return pcmProfileApprovalDTO;
    }

    @Override
    public List<PcmProfileApproval> toDomain(List<PcmProfileApprovalDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmProfileApproval> list = new ArrayList<PcmProfileApproval>( dtoList.size() );
        for ( PcmProfileApprovalDTO pcmProfileApprovalDTO : dtoList ) {
            list.add( toDomain( pcmProfileApprovalDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmProfileApprovalDTO> toDto(List<PcmProfileApproval> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmProfileApprovalDTO> list = new ArrayList<PcmProfileApprovalDTO>( entityList.size() );
        for ( PcmProfileApproval pcmProfileApproval : entityList ) {
            list.add( toDto( pcmProfileApproval ) );
        }

        return list;
    }
}
